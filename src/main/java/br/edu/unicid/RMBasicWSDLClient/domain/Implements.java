//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.02.20 às 07:16:30 PM BRT 
//


package br.edu.unicid.RMBasicWSDLClient.domain;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="type" type="{http://schemas.datacontract.org/2004/07/System}Type" minOccurs="0"/&gt;
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
    "type"
})
@XmlRootElement(name = "Implements")
public class Implements {

    @XmlElementRef(name = "type", namespace = "http://www.totvs.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<Type> type;

    /**
     * Obtém o valor da propriedade type.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Type }{@code >}
     *     
     */
    public JAXBElement<Type> getType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Type }{@code >}
     *     
     */
    public void setType(JAXBElement<Type> value) {
        this.type = value;
    }

}
