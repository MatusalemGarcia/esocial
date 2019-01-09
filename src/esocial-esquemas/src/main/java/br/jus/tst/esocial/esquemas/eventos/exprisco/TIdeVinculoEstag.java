//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.09 at 02:26:33 PM BRST 
//


package br.jus.tst.esocial.esquemas.eventos.exprisco;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Informacoes do V\u00ednculo trabalhista e estagi\u00e1rio
 * 
 * <p>Java class for TIdeVinculoEstag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIdeVinculoEstag">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpfTrab">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="11"/>
 *               &lt;pattern value="\d{11}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nisTrab" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="matricula" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codCateg" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;pattern value="\d{3}"/>
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
@XmlType(name = "TIdeVinculoEstag", namespace = "http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_05_00", propOrder = {
    "cpfTrab",
    "nisTrab",
    "matricula",
    "codCateg"
})
public class TIdeVinculoEstag {

    @XmlElement(required = true)
    protected String cpfTrab;
    protected String nisTrab;
    protected String matricula;
    protected BigInteger codCateg;

    /**
     * Gets the value of the cpfTrab property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfTrab() {
        return cpfTrab;
    }

    /**
     * Sets the value of the cpfTrab property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfTrab(String value) {
        this.cpfTrab = value;
    }

    /**
     * Gets the value of the nisTrab property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNisTrab() {
        return nisTrab;
    }

    /**
     * Sets the value of the nisTrab property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNisTrab(String value) {
        this.nisTrab = value;
    }

    /**
     * Gets the value of the matricula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Sets the value of the matricula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
    }

    /**
     * Gets the value of the codCateg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodCateg() {
        return codCateg;
    }

    /**
     * Sets the value of the codCateg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodCateg(BigInteger value) {
        this.codCateg = value;
    }

}
