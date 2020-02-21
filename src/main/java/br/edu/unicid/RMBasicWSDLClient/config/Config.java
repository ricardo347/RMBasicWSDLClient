package br.edu.unicid.RMBasicWSDLClient.config;

import org.apache.http.auth.UsernamePasswordCredentials;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

import br.edu.unicid.RMBasicWSDLClient.service.SOAPConnector;

@Configuration
public class Config {
	
	@Value("${client.default-uri}")
	private String defaultUri;
	
	@Value("${client.user.name}")
	private String userName = "rmoura";
	
	@Value("${client.user.password}")
	private String userPassword = "#Inovare347#";
	
	@Bean
	public Jaxb2Marshaller marshaller() {		
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("br.edu.unicid.RMBasicWSDLClient.domain");		                           
		return marshaller;
	}
	@Bean
	public SOAPConnector soapConnector (Jaxb2Marshaller marshaller) {		
	
	SOAPConnector client = new SOAPConnector();
	    client.setDefaultUri("http://dominica.rede1.br:8051/wsConsultaSQL/IwsConsultaSQL");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);		
		//setting the basic auth
		//client.setMessageSender(httpComponentsMessageSender());
		return client;
	}
	
	//Methods to Set the Basic Auth
	
	@Bean
	public HttpComponentsMessageSender httpComponentsMessageSender() {
		HttpComponentsMessageSender httpComponentsMessageSender = new HttpComponentsMessageSender();
		httpComponentsMessageSender.setCredentials(usernamePasswordCredentials());		
		return httpComponentsMessageSender;
	}
	
	@Bean
	public UsernamePasswordCredentials usernamePasswordCredentials() {		
		return new UsernamePasswordCredentials(userName, userPassword);
	}
}
