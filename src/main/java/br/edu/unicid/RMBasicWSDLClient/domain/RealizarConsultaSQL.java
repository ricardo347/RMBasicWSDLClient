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
 *         &lt;element name="codSentenca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codColigada" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codSistema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parameters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "codSentenca",
    "codColigada",
    "codSistema",
    "parameters"
})
@XmlRootElement(name = "RealizarConsultaSQL")
public class RealizarConsultaSQL {

    @XmlElementRef(name = "codSentenca", namespace = "http://www.totvs.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codSentenca;
    protected Integer codColigada;
    @XmlElementRef(name = "codSistema", namespace = "http://www.totvs.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codSistema;
    @XmlElementRef(name = "parameters", namespace = "http://www.totvs.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parameters;

    /**
     * Obtém o valor da propriedade codSentenca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodSentenca() {
        return codSentenca;
    }

    /**
     * Define o valor da propriedade codSentenca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodSentenca(JAXBElement<String> value) {
        this.codSentenca = value;
    }

    /**
     * Obtém o valor da propriedade codColigada.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodColigada() {
        return codColigada;
    }

    /**
     * Define o valor da propriedade codColigada.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodColigada(Integer value) {
        this.codColigada = value;
    }

    /**
     * Obtém o valor da propriedade codSistema.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodSistema() {
        return codSistema;
    }

    /**
     * Define o valor da propriedade codSistema.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodSistema(JAXBElement<String> value) {
        this.codSistema = value;
    }

    /**
     * Obtém o valor da propriedade parameters.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParameters() {
        return parameters;
    }

    /**
     * Define o valor da propriedade parameters.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParameters(JAXBElement<String> value) {
        this.parameters = value;
    }

}
