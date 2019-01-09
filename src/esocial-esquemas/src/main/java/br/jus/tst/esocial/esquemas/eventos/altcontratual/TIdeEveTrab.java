//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.09 at 02:26:24 PM BRST 
//


package br.jus.tst.esocial.esquemas.eventos.altcontratual;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifica\u00e7\u00e3o do evento
 * 
 * <p>Java class for TIdeEveTrab complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIdeEveTrab">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indRetif">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;pattern value="\d"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nrRecibo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tpAmb">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;pattern value="\d"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="procEmi">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;pattern value="\d"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="verProc">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="20"/>
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
@XmlType(name = "TIdeEveTrab", namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_05_00", propOrder = {
    "indRetif",
    "nrRecibo",
    "tpAmb",
    "procEmi",
    "verProc"
})
public class TIdeEveTrab {

    protected byte indRetif;
    protected String nrRecibo;
    protected byte tpAmb;
    protected byte procEmi;
    @XmlElement(required = true)
    protected String verProc;

    /**
     * Gets the value of the indRetif property.
     * 
     */
    public byte getIndRetif() {
        return indRetif;
    }

    /**
     * Sets the value of the indRetif property.
     * 
     */
    public void setIndRetif(byte value) {
        this.indRetif = value;
    }

    /**
     * Gets the value of the nrRecibo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrRecibo() {
        return nrRecibo;
    }

    /**
     * Sets the value of the nrRecibo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrRecibo(String value) {
        this.nrRecibo = value;
    }

    /**
     * Gets the value of the tpAmb property.
     * 
     */
    public byte getTpAmb() {
        return tpAmb;
    }

    /**
     * Sets the value of the tpAmb property.
     * 
     */
    public void setTpAmb(byte value) {
        this.tpAmb = value;
    }

    /**
     * Gets the value of the procEmi property.
     * 
     */
    public byte getProcEmi() {
        return procEmi;
    }

    /**
     * Sets the value of the procEmi property.
     * 
     */
    public void setProcEmi(byte value) {
        this.procEmi = value;
    }

    /**
     * Gets the value of the verProc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerProc() {
        return verProc;
    }

    /**
     * Sets the value of the verProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerProc(String value) {
        this.verProc = value;
    }

}
