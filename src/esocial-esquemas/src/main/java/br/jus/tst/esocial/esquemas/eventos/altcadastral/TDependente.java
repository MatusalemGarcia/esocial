//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.09 at 02:26:23 PM BRST 
//


package br.jus.tst.esocial.esquemas.eventos.altcadastral;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TDependente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDependente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpDep">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *               &lt;pattern value="\d{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nmDep">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="2"/>
 *               &lt;maxLength value="70"/>
 *               &lt;whiteSpace value="preserve"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dtNascto">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cpfDep" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{11}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="depIRRF">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[N|S]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="depSF">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[N|S]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="incTrab">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[N|S]"/>
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
@XmlType(name = "TDependente", namespace = "http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_05_00", propOrder = {
    "tpDep",
    "nmDep",
    "dtNascto",
    "cpfDep",
    "depIRRF",
    "depSF",
    "incTrab"
})
public class TDependente {

    @XmlElement(required = true)
    protected String tpDep;
    @XmlElement(required = true)
    protected String nmDep;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dtNascto;
    protected String cpfDep;
    @XmlElement(required = true)
    protected String depIRRF;
    @XmlElement(required = true)
    protected String depSF;
    @XmlElement(required = true)
    protected String incTrab;

    /**
     * Gets the value of the tpDep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpDep() {
        return tpDep;
    }

    /**
     * Sets the value of the tpDep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpDep(String value) {
        this.tpDep = value;
    }

    /**
     * Gets the value of the nmDep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmDep() {
        return nmDep;
    }

    /**
     * Sets the value of the nmDep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmDep(String value) {
        this.nmDep = value;
    }

    /**
     * Gets the value of the dtNascto property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtNascto() {
        return dtNascto;
    }

    /**
     * Sets the value of the dtNascto property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtNascto(XMLGregorianCalendar value) {
        this.dtNascto = value;
    }

    /**
     * Gets the value of the cpfDep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfDep() {
        return cpfDep;
    }

    /**
     * Sets the value of the cpfDep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfDep(String value) {
        this.cpfDep = value;
    }

    /**
     * Gets the value of the depIRRF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepIRRF() {
        return depIRRF;
    }

    /**
     * Sets the value of the depIRRF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepIRRF(String value) {
        this.depIRRF = value;
    }

    /**
     * Gets the value of the depSF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepSF() {
        return depSF;
    }

    /**
     * Sets the value of the depSF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepSF(String value) {
        this.depSF = value;
    }

    /**
     * Gets the value of the incTrab property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncTrab() {
        return incTrab;
    }

    /**
     * Sets the value of the incTrab property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncTrab(String value) {
        this.incTrab = value;
    }

}
