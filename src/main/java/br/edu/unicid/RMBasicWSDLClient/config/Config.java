package br.edu.unicid.RMBasicWSDLClient.config;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.apache.http.auth.UsernamePasswordCredentials;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

import com.sun.xml.bind.marshaller.CharacterEscapeHandler;

import br.edu.unicid.RMBasicWSDLClient.domain.MovMovimentoTBCData.MovMovimento;
import br.edu.unicid.RMBasicWSDLClient.domain.wsDataServer.SaveRecord;
import br.edu.unicid.RMBasicWSDLClient.service.SOAPConnector;

@Configuration
public class Config {
	
	@Value("${client.default-uri}")
	private String defaultUri;
	
	@Value("${client.user.name}")
	private String userName;
	
	@Value("${client.user.password}")
	private String userPassword;
	@Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this is the package name specified in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("br.edu.unicid.RMBasicWSDLClient.domain.wsDataServer");
        return marshaller;
    }
	@Bean
	public SOAPConnector soapConnector (Jaxb2Marshaller marshaller) {		
	
	SOAPConnector client = new SOAPConnector();
	    //client.setDefaultUri("http://dominica.rede1.br:8051/wsConsultaSQL/IwsConsultaSQL");
		client.setDefaultUri("http://dominica.rede1.br:8051/wsDataServer/IwsDataServer");
		client.setMarshaller(marshaller);
		client.setUnmarshaller( marshaller);		
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
