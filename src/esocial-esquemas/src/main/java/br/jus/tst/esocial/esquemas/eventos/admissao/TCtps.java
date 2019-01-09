//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.09 at 02:26:22 PM BRST 
//


package br.jus.tst.esocial.esquemas.eventos.admissao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Carteira de Trabalho e Previd\u00eancia Social
 * 
 * <p>Java class for TCtps complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TCtps">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nrCtps">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="2"/>
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="serieCtps">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ufCtps">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="AC"/>
 *               &lt;enumeration value="AL"/>
 *               &lt;enumeration value="AP"/>
 *               &lt;enumeration value="AM"/>
 *               &lt;enumeration value="BA"/>
 *               &lt;enumeration value="CE"/>
 *               &lt;enumeration value="DF"/>
 *               &lt;enumeration value="ES"/>
 *               &lt;enumeration value="GO"/>
 *               &lt;enumeration value="MA"/>
 *               &lt;enumeration value="MT"/>
 *               &lt;enumeration value="MS"/>
 *               &lt;enumeration value="MG"/>
 *               &lt;enumeration value="PA"/>
 *               &lt;enumeration value="PB"/>
 *               &lt;enumeration value="PR"/>
 *               &lt;enumeration value="PE"/>
 *               &lt;enumeration value="PI"/>
 *               &lt;enumeration value="RJ"/>
 *               &lt;enumeration value="RN"/>
 *               &lt;enumeration value="RS"/>
 *               &lt;enumeration value="RO"/>
 *               &lt;enumeration value="RR"/>
 *               &lt;enumeration value="SC"/>
 *               &lt;enumeration value="SP"/>
 *               &lt;enumeration value="SE"/>
 *               &lt;enumeration value="TO"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCtps", namespace = "http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_05_00", propOrder = {
    "nrCtps",
    "serieCtps",
    "ufCtps"
})
public class TCtps {

    @XmlElement(required = true)
    protected String nrCtps;
    @XmlElement(required = true)
    protected String serieCtps;
    @XmlElement(required = true)
    protected String ufCtps;

    /**
     * Gets the value of the nrCtps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrCtps() {
        return nrCtps;
    }

    /**
     * Sets the value of the nrCtps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrCtps(String value) {
        this.nrCtps = value;
    }

    /**
     * Gets the value of the serieCtps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerieCtps() {
        return serieCtps;
    }

    /**
     * Sets the value of the serieCtps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerieCtps(String value) {
        this.serieCtps = value;
    }

    /**
     * Gets the value of the ufCtps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfCtps() {
        return ufCtps;
    }

    /**
     * Sets the value of the ufCtps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfCtps(String value) {
        this.ufCtps = value;
    }

}
