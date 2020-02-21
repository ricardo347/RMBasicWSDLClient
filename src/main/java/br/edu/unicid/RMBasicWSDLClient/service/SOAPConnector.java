package br.edu.unicid.RMBasicWSDLClient.service;

import java.io.IOException;
import java.net.HttpURLConnection;

import javax.xml.transform.TransformerException;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.naming.factory.TransactionFactory;
import org.springframework.cglib.core.Transformer;
import org.springframework.util.Assert;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.transport.context.TransportContext;
import org.springframework.ws.transport.context.TransportContextHolder;
import org.springframework.ws.transport.http.HttpUrlConnection;

public class SOAPConnector extends WebServiceGatewaySupport {

	public Object callWebService(String url, Object request) {		
		
		/*ClientInterceptor[] interceptors = {};//= this.getInterceptors();

		interceptors = (ClientInterceptor[]) ArrayUtils.add(interceptors, new ClientInterceptor() {
			@Override
			public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
				
				System.out.print("Handling request %%%%%%");
				return true;
			}

			@Override
			public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {
				
				System.out.print("Handling response %%%%%%");
				return true;
			}

			@Override
			public boolean handleFault(MessageContext messageContext) throws WebServiceClientException {
				return true;
			}

			@Override
			public void afterCompletion(MessageContext messageContext, Exception ex) throws WebServiceClientException {
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
		});*/

		//this.setInterceptors(interceptors);		
		return getWebServiceTemplate().marshalSendAndReceive(url, request, new WebServiceMessageCallback() {
			
			@Override
			public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
				
				Assert.isInstanceOf(SoapMessage.class, message);
				SoapMessage soapMessage = (SoapMessage) message;
				soapMessage.setSoapAction("http://www.totvs.com/IwsConsultaSQL/RealizarConsultaSQL");
				
				TransportContext context = TransportContextHolder.getTransportContext();
				HttpUrlConnection connection = (HttpUrlConnection) context.getConnection();
				HttpURLConnection conn = connection.getConnection();
			    conn.setRequestProperty("Authorization", "Basic cm1vdXJhOiNJbm92YXJlMzQ3Iw==");		    
				
				
			}
		}) ;
	}
	
	
}

