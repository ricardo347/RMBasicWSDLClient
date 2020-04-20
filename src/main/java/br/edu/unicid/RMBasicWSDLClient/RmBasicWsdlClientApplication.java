package br.edu.unicid.RMBasicWSDLClient;

import java.io.StringWriter;
import java.math.BigDecimal;
import java.time.Instant;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.edu.unicid.RMBasicWSDLClient.domain.MovMovimentoTBCData.MovMovimento;
import br.edu.unicid.RMBasicWSDLClient.domain.MovMovimentoTBCData.MovMovimento.TITMMOV;
import br.edu.unicid.RMBasicWSDLClient.domain.MovMovimentoTBCData.MovMovimento.TMOV;
import br.edu.unicid.RMBasicWSDLClient.domain.MovMovimentoTBCData.MovMovimento.TMOVFISCAL;
import br.edu.unicid.RMBasicWSDLClient.domain.wsConsultaSQL.RealizarConsultaSQL;
import br.edu.unicid.RMBasicWSDLClient.domain.wsConsultaSQL.RealizarConsultaSQLResponse;
import br.edu.unicid.RMBasicWSDLClient.domain.wsDataServer.SaveRecord;
import br.edu.unicid.RMBasicWSDLClient.domain.wsDataServer.SaveRecordResponse;
import br.edu.unicid.RMBasicWSDLClient.service.SOAPConnector;

@SpringBootApplication
public class RmBasicWsdlClientApplication {
		
	public static void main(String[] args) {
		SpringApplication.run(RmBasicWsdlClientApplication.class, args);
	}

	@Bean
	CommandLineRunner lookup(SOAPConnector soapConnector) {
		
		return args -> {			
        
		br.edu.unicid.RMBasicWSDLClient.domain.wsDataServer.ObjectFactory wsDataServerObjectFactory = 
				new br.edu.unicid.RMBasicWSDLClient.domain.wsDataServer.ObjectFactory();
		
		br.edu.unicid.RMBasicWSDLClient.domain.MovMovimentoTBCData.ObjectFactory movMovimentoTBCDataObjectFactory = 
				new br.edu.unicid.RMBasicWSDLClient.domain.MovMovimentoTBCData.ObjectFactory();
		br.edu.unicid.RMBasicWSDLClient.domain.wsConsultaSQL.ObjectFactory wsConsultaSQLObjectFactory = 
				new br.edu.unicid.RMBasicWSDLClient.domain.wsConsultaSQL.ObjectFactory();	
		
		/*RealizarConsultaSQL request = new RealizarConsultaSQL();
        request.setCodColigada(0);
        request.setCodSentenca(wsConsultaSQLObjectFactory.createRealizarConsultaSQLCodSentenca("TESTE.WEBSERVICE"));    
        request.setCodSistema(wsConsultaSQLObjectFactory.createRealizarConsultaSQLCodSistema("G"));
        
        RealizarConsultaSQLResponse response = (RealizarConsultaSQLResponse) soapConnector.callWebService("http://dominica.rede1.br:8051/wsConsultaSQL/IwsConsultaSQL", request);*/
        
		Instant i = Instant.parse("2020-02-29T11:35:30.00Z");
        XMLGregorianCalendar gc = DatatypeFactory.newInstance().newXMLGregorianCalendar(i.toString());
        
        BigDecimal valor = new BigDecimal("1000.20");
        
		TMOV tmov = movMovimentoTBCDataObjectFactory.createMovMovimentoTMOV();
        tmov.setCODCOLIGADA((short) 5);
        tmov.setIDMOV(-1);
        tmov.setCODFILIAL((short) 1);
        tmov.setCODLOC("01");
        tmov.setCODCFO("F0000075150");
        tmov.setSERIE("1");
        tmov.setNUMEROMOV("-1");
        tmov.setCODTMV("2.2.01");
        tmov.setSTATUS("N");
        tmov.setMOVIMPRESSO((short) 0);
        tmov.setDOCIMPRESSO((short) 0);
        tmov.setFATIMPRESSA((short) 0);
        tmov.setDATAEMISSAO(gc);
        tmov.setDATASAIDA(gc);
        tmov.setVALORBRUTO(valor);
        tmov.setVALORLIQUIDO(valor);
        tmov.setVALOROUTROS(valor);
        tmov.setDATAMOVIMENTO(gc);
        tmov.setCODUSUARIO("rmoura");
        tmov.setIDNAT(504);
        tmov.setHORARIOEMISSAO(gc);
        tmov.setUSUARIOCRIACAO("rmoura");
        tmov.setDATACRIACAO(gc);
        tmov.setVALORBRUTOINTERNO(valor);
        tmov.setCODTDO("55");
        tmov.setDATALANCAMENTO(gc);
        tmov.setHISTORICOCURTO("Movimento criado via java");
		tmov.setIDMOVHST(-1);
		
		TMOVFISCAL tmovFiscal = movMovimentoTBCDataObjectFactory.createMovMovimentoTMOVFISCAL();
		tmovFiscal.setCODCOLIGADA((short) 5);
		tmovFiscal.setIDMOV(-1);
		tmovFiscal.setCONTRIBUINTECREDENCIADO((short) 0);
		tmovFiscal.setDATAINICIOCREDITO(gc);
		tmovFiscal.setOPERACAOPRESENCIAL((short) 0);		
		
		TITMMOV titmmov = movMovimentoTBCDataObjectFactory.createMovMovimentoTITMMOV();
		titmmov.setCODCOLIGADA((short) 5);
		titmmov.setIDMOV(-1);
		titmmov.setNSEQITMMOV(1);
		titmmov.setCODFILIAL((short) 1);
		titmmov.setNUMEROSEQUENCIAL((short) 1);
		titmmov.setIDPRD(319066);
		titmmov.setNOMEFANTASIA("SERVIÇOS DE INSTRUÇÃO E TREINAMENTO");
		titmmov.setQUANTIDADE(new BigDecimal(1));
		titmmov.setDATAEMISSAO(gc);
		titmmov.setCODUND("UN");
		titmmov.setPRECOUNITARIO(valor);
		titmmov.setVALORUNITARIO(valor);
		titmmov.setVALORBRUTOITEM(valor);
		titmmov.setVALORBRUTOITEMORIG(valor);
		titmmov.setVALORCODIGOPRD("0");
		titmmov.setVALORDEDUCAO(new BigDecimal(0));
		titmmov.setVALORDESC(new BigDecimal(0));
		titmmov.setVALORDESCCONDICONALITM(new BigDecimal(0));
		titmmov.setVALORDESP(new BigDecimal(0));
		titmmov.setVALORDESPCONDICIONALITM(new BigDecimal(0));
		titmmov.setVALORESCRITURACAO(new BigDecimal(0));
		titmmov.setVALORFINANCEIRO(new BigDecimal(0));
		titmmov.setVALORFINANCGERENCIAL(new BigDecimal(0));
		titmmov.setVALSERVICONFE(valor);
		titmmov.setCODLOC("01");
		titmmov.setIDNAT(504);			
		
        MovMovimento mov = new MovMovimento();
		mov.getTMOVOrTTRBMOVOrTNFE().add(tmov);
		mov.getTMOVOrTTRBMOVOrTNFE().add(tmovFiscal);
		mov.getTMOVOrTTRBMOVOrTNFE().add(titmmov);
		
		
        SaveRecord saveRequest = new SaveRecord();
        saveRequest.setDataServerName(wsDataServerObjectFactory.createSaveRecordDataServerName("MovMovimentoTBCData"));
        //saveRequest.setXML(wsDataServerObjectFactory.createSaveRecordXML(mov.toString()));
        saveRequest.setXML(wsDataServerObjectFactory.createSaveRecordXML("<MOV>Teste de xml  sdf</MOV>"));
       
               
      
        //JAXBElement<String> teste = new JAXBElement<String>(new QName("http://teste.com.br", "XML"),String.class,"<MOV>content354623462t wqgasdgf</MOV>");
        
       
                
        System.out.println(saveRequest.toString());
        //SaveRecordResponse response = (SaveRecordResponse) soapConnector.callWebService("http://dominica.rede1.br:8051/wsDataServer/IwsDataServer",saveRequest);
       
        
        System.out.println("Got Response As below ========= : ");
        //System.out.println("Movimento criado: "+response.getSaveRecordResult().getValue());
        //System.out.println("Name : "+response.getRealizarConsultaSQLResult().getValue());
       
	};
	}
}
