//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.03.16 às 06:46:52 PM BRT 
//


package br.edu.unicid.RMBasicWSDLClient.domain.wsDataServer;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


import com.sun.xml.internal.bind.marshaller.*;

import br.edu.unicid.RMBasicWSDLClient.domain.MovMovimentoTBCData.MovMovimento;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataServerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contexto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dataServerName",
    "xml",
    "contexto"
})
@XmlRootElement(name = "SaveRecord")
public class SaveRecord {

    @XmlElementRef(name = "DataServerName", namespace = "http://www.totvs.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataServerName;
    @XmlElementRef(name = "XML", namespace = "http://www.totvs.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xml;
   
    
    @XmlElementRef(name = "Contexto", namespace = "http://www.totvs.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contexto;

    /**
     * Obtém o valor da propriedade dataServerName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataServerName() {
        return dataServerName;
    }

    /**
     * Define o valor da propriedade dataServerName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataServerName(JAXBElement<String> value) {
        this.dataServerName = value;
    }

    /**
     * Obtém o valor da propriedade xml.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    
    public JAXBElement<String> getXML() {
        return xml;
    }

    /**
     * Define o valor da propriedade xml.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
   
    public void setXML(JAXBElement<String> value) {
        this.xml = value;
    }

    /**
     * Obtém o valor da propriedade contexto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContexto() {
        return contexto;
    }

    /**
     * Define o valor da propriedade contexto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContexto(JAXBElement<String> value) {
        this.contexto = value;
    }

	@Override
	public String toString() {
		 StringWriter sw = new StringWriter();
	      CharacterEscapeHandler a = new CharacterEscapeHandler() {
			
			@Override
			public void escape(char[] ch, int start, int length, boolean isAttVal, Writer out) throws IOException {
				// TODO Auto-generated method stub
				
			}
		};
	        try {
				JAXBContext context = JAXBContext.newInstance(this.getClass());
				Marshaller marshaller = context.createMarshaller();
				marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);	
				marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				//marshaller.setProperty("com.sun.xml.internal.bind.marshaller.CharacterEscapeHandler", a);
				marshaller.marshal(this,System.out);			
				
			} catch (JAXBException e) {
				e.printStackTrace();
				
			}
		return sw.toString();
	} 
    

}
