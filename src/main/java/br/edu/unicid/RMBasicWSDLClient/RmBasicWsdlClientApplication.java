package br.edu.unicid.RMBasicWSDLClient;

import javax.xml.bind.JAXBElement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.edu.unicid.RMBasicWSDLClient.domain.ObjectFactory;
import br.edu.unicid.RMBasicWSDLClient.domain.RealizarConsultaSQL;
import br.edu.unicid.RMBasicWSDLClient.domain.RealizarConsultaSQLResponse;
import br.edu.unicid.RMBasicWSDLClient.service.SOAPConnector;

@SpringBootApplication
public class RmBasicWsdlClientApplication {
		
	public static void main(String[] args) {
		SpringApplication.run(RmBasicWsdlClientApplication.class, args);
	}

	@Bean
	CommandLineRunner lookup(SOAPConnector soapConnector) {
		
		return args -> {			
        RealizarConsultaSQL request = new RealizarConsultaSQL();
        request.setCodColigada(0);
        request.setCodSentenca(new ObjectFactory().createRealizarConsultaSQLCodSentenca("TESTE.WEBSERVICE"));    
        request.setCodSistema(new ObjectFactory().createRealizarConsultaSQLCodSistema("G"));  
        
        RealizarConsultaSQLResponse response = (RealizarConsultaSQLResponse) soapConnector.callWebService("http://dominica.rede1.br:8051/wsConsultaSQL/IwsConsultaSQL", request);
        
        System.out.println("Got Response As below ========= : ");
        System.out.println("Name : "+response.getRealizarConsultaSQLResult().getValue());
       
	};
	}
}
