package br.edu.unicid.RMBasicWSDLClient.config;

import static org.apache.tomcat.util.codec.binary.Base64.encodeBase64String;

import java.io.IOException;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.transport.WebServiceConnection;
import org.springframework.ws.transport.context.TransportContextHolder;
import org.springframework.ws.transport.http.HttpUrlConnection;


public final class PreemptiveAuth implements ClientInterceptor {
	
    private static final String HEADER_AUTHORIZATION = "Authorization";
    private static final String BASIC_AUTH = "Basic ";
    private static final char BASIC_AUTH_SEPARATOR = ':';
    private static final boolean CONTINUE_PROCESSING = true;
    private final Logger LOGGER = LoggerFactory.getLogger(PreemptiveAuth.class);
    private final String userName;
    private final String password;

    @Override
    public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
    	
        System.out.println("handleRequest $$$");
    	return getConnection(TransportContextHolder.getTransportContext().getConnection())
            .map(httpConnection -> appendAuthorization(httpConnection))
            .orElseGet(() -> CONTINUE_PROCESSING);
    }

    /**
     * Get connection from context
     *
     * @param connection current SOAP connection
     * @return optional connection
     */
    private Optional<HttpUrlConnection> getConnection(WebServiceConnection connection) {
    	System.out.println("getConnection $$$");
        if (connection instanceof HttpUrlConnection) {
            return Optional.of((HttpUrlConnection) connection);
        } else {
            LOGGER.error("Preemptive auth skipped due to SOAP connection that doesn't implement: {}", HttpUrlConnection.class);
            System.out.println("Preemptive auth skipped due to SOAP connection that doesn't implement: {}");
            return Optional.empty();
        }
    }

    /**
     * Append basic auth header to given connection
     *
     * @param connection connection where header should be appended to
     * @return flag indicating whether processing should be continued
     */
    private boolean appendAuthorization(HttpUrlConnection connection) {
    	System.out.println("appendAuthorization $$$");      
    	
        LOGGER.debug("Preemptive auth - applying auth - user: {}, pass length: {}", userName, password.length());
        connection
            .getConnection()
            .addRequestProperty(
                HEADER_AUTHORIZATION, BASIC_AUTH + encodeBase64String(getCredentials().getBytes()));
      
        return CONTINUE_PROCESSING;
    }

    /**
     * Get credentials
     *
     * @return non-empty string
     */
    private String getCredentials() {
    	 System.out.println("GetCredentials $$$");
        return userName + BASIC_AUTH_SEPARATOR + password;
       
    }

    @Override
    public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {
    	System.out.println("handleResponse $$$");
        return CONTINUE_PROCESSING;
    }

    @Override
    public boolean handleFault(MessageContext messageContext) throws WebServiceClientException {
    	 System.out.println("Handle Fault $$$");
        return CONTINUE_PROCESSING;
    }

    @Override
    public void afterCompletion(MessageContext messageContext, Exception e) throws WebServiceClientException {
    	try {
			System.out.println("Request :");
			messageContext.getRequest().writeTo(System.out);
			System.out.println("\nResponse : ");
			messageContext.getResponse().writeTo(System.out);
			System.out.println();
		} catch (IOException ignored) {
			System.out.println(ignored.getMessage());
		}
    }

    public PreemptiveAuth(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}