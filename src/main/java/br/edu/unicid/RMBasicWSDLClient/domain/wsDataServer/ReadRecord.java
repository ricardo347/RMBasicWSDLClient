//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.03.16 às 06:46:52 PM BRT 
//


package br.edu.unicid.RMBasicWSDLClient.domain.wsDataServer;

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
 *         &lt;element name="DataServerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "primaryKey",
    "contexto"
})
@XmlRootElement(name = "ReadRecord")
public class ReadRecord {

    @XmlElementRef(name = "DataServerName", namespace = "http://www.totvs.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataServerName;
    @XmlElementRef(name = "PrimaryKey", namespace = "http://www.totvs.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryKey;
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
     * Obtém o valor da propriedade primaryKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryKey() {
        return primaryKey;
    }

    /**
     * Define o valor da propriedade primaryKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryKey(JAXBElement<String> value) {
        this.primaryKey = value;
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

}