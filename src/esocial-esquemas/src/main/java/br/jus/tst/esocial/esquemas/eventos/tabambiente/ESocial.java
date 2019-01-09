//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.09 at 02:26:42 PM BRST 
//


package br.jus.tst.esocial.esquemas.eventos.tabambiente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evtTabAmbiente">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00}TIdeCadastro"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00}TEmpregador"/>
 *                   &lt;element name="infoAmbiente">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="inclusao">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ideAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00}TIdeAmbiente"/>
 *                                         &lt;element name="dadosAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00}TDadosAmbiente"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="alteracao">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ideAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00}TIdeAmbiente"/>
 *                                         &lt;element name="dadosAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00}TDadosAmbiente"/>
 *                                         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00}TPeriodoValidade" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="exclusao">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ideAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00}TIdeAmbiente"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/choice>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "evtTabAmbiente",
    "signature"
})
@XmlRootElement(name = "eSocial", namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00")
public class ESocial {

    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00", required = true)
    protected ESocial.EvtTabAmbiente evtTabAmbiente;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;

    /**
     * Gets the value of the evtTabAmbiente property.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtTabAmbiente }
     *     
     */
    public ESocial.EvtTabAmbiente getEvtTabAmbiente() {
        return evtTabAmbiente;
    }

    /**
     * Sets the value of the evtTabAmbiente property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtTabAmbiente }
     *     
     */
    public void setEvtTabAmbiente(ESocial.EvtTabAmbiente value) {
        this.evtTabAmbiente = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00}TIdeCadastro"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00}TEmpregador"/>
     *         &lt;element name="infoAmbiente">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="inclusao">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="ideAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00}TIdeAmbiente"/>
     *                               &lt;element name="dadosAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00}TDadosAmbiente"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="alteracao">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="ideAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00}TIdeAmbiente"/>
     *                               &lt;element name="dadosAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00}TDadosAmbiente"/>
     *                               &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00}TPeriodoValidade" minOccurs="0"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="exclusao">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="ideAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00}TIdeAmbiente"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/choice>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ideEvento",
        "ideEmpregador",
        "infoAmbiente"
    })
    public static class EvtTabAmbiente {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00", required = true)
        protected TIdeCadastro ideEvento;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00", required = true)
        protected TEmpregador ideEmpregador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00", required = true)
        protected ESocial.EvtTabAmbiente.InfoAmbiente infoAmbiente;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;

        /**
         * Gets the value of the ideEvento property.
         * 
         * @return
         *     possible object is
         *     {@link TIdeCadastro }
         *     
         */
        public TIdeCadastro getIdeEvento() {
            return ideEvento;
        }

        /**
         * Sets the value of the ideEvento property.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeCadastro }
         *     
         */
        public void setIdeEvento(TIdeCadastro value) {
            this.ideEvento = value;
        }

        /**
         * Gets the value of the ideEmpregador property.
         * 
         * @return
         *     possible object is
         *     {@link TEmpregador }
         *     
         */
        public TEmpregador getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Sets the value of the ideEmpregador property.
         * 
         * @param value
         *     allowed object is
         *     {@link TEmpregador }
         *     
         */
        public void setIdeEmpregador(TEmpregador value) {
            this.ideEmpregador = value;
        }

        /**
         * Gets the value of the infoAmbiente property.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtTabAmbiente.InfoAmbiente }
         *     
         */
        public ESocial.EvtTabAmbiente.InfoAmbiente getInfoAmbiente() {
            return infoAmbiente;
        }

        /**
         * Sets the value of the infoAmbiente property.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtTabAmbiente.InfoAmbiente }
         *     
         */
        public void setInfoAmbiente(ESocial.EvtTabAmbiente.InfoAmbiente value) {
            this.infoAmbiente = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;choice>
         *           &lt;element name="inclusao">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="ideAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00}TIdeAmbiente"/>
         *                     &lt;element name="dadosAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00}TDadosAmbiente"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="alteracao">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="ideAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00}TIdeAmbiente"/>
         *                     &lt;element name="dadosAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00}TDadosAmbiente"/>
         *                     &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00}TPeriodoValidade" minOccurs="0"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="exclusao">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="ideAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00}TIdeAmbiente"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *         &lt;/choice>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "inclusao",
            "alteracao",
            "exclusao"
        })
        public static class InfoAmbiente {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00")
            protected ESocial.EvtTabAmbiente.InfoAmbiente.Inclusao inclusao;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00")
            protected ESocial.EvtTabAmbiente.InfoAmbiente.Alteracao alteracao;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00")
            protected ESocial.EvtTabAmbiente.InfoAmbiente.Exclusao exclusao;

            /**
             * Gets the value of the inclusao property.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabAmbiente.InfoAmbiente.Inclusao }
             *     
             */
            public ESocial.EvtTabAmbiente.InfoAmbiente.Inclusao getInclusao() {
                return inclusao;
            }

            /**
             * Sets the value of the inclusao property.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabAmbiente.InfoAmbiente.Inclusao }
             *     
             */
            public void setInclusao(ESocial.EvtTabAmbiente.InfoAmbiente.Inclusao value) {
                this.inclusao = value;
            }

            /**
             * Gets the value of the alteracao property.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabAmbiente.InfoAmbiente.Alteracao }
             *     
             */
            public ESocial.EvtTabAmbiente.InfoAmbiente.Alteracao getAlteracao() {
                return alteracao;
            }

            /**
             * Sets the value of the alteracao property.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabAmbiente.InfoAmbiente.Alteracao }
             *     
             */
            public void setAlteracao(ESocial.EvtTabAmbiente.InfoAmbiente.Alteracao value) {
                this.alteracao = value;
            }

            /**
             * Gets the value of the exclusao property.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabAmbiente.InfoAmbiente.Exclusao }
             *     
             */
            public ESocial.EvtTabAmbiente.InfoAmbiente.Exclusao getExclusao() {
                return exclusao;
            }

            /**
             * Sets the value of the exclusao property.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabAmbiente.InfoAmbiente.Exclusao }
             *     
             */
            public void setExclusao(ESocial.EvtTabAmbiente.InfoAmbiente.Exclusao value) {
                this.exclusao = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="ideAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00}TIdeAmbiente"/>
             *         &lt;element name="dadosAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00}TDadosAmbiente"/>
             *         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00}TPeriodoValidade" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "ideAmbiente",
                "dadosAmbiente",
                "novaValidade"
            })
            public static class Alteracao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00", required = true)
                protected TIdeAmbiente ideAmbiente;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00", required = true)
                protected TDadosAmbiente dadosAmbiente;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00")
                protected TPeriodoValidade novaValidade;

                /**
                 * Gets the value of the ideAmbiente property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeAmbiente }
                 *     
                 */
                public TIdeAmbiente getIdeAmbiente() {
                    return ideAmbiente;
                }

                /**
                 * Sets the value of the ideAmbiente property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeAmbiente }
                 *     
                 */
                public void setIdeAmbiente(TIdeAmbiente value) {
                    this.ideAmbiente = value;
                }

                /**
                 * Gets the value of the dadosAmbiente property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TDadosAmbiente }
                 *     
                 */
                public TDadosAmbiente getDadosAmbiente() {
                    return dadosAmbiente;
                }

                /**
                 * Sets the value of the dadosAmbiente property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TDadosAmbiente }
                 *     
                 */
                public void setDadosAmbiente(TDadosAmbiente value) {
                    this.dadosAmbiente = value;
                }

                /**
                 * Gets the value of the novaValidade property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TPeriodoValidade }
                 *     
                 */
                public TPeriodoValidade getNovaValidade() {
                    return novaValidade;
                }

                /**
                 * Sets the value of the novaValidade property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TPeriodoValidade }
                 *     
                 */
                public void setNovaValidade(TPeriodoValidade value) {
                    this.novaValidade = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="ideAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00}TIdeAmbiente"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "ideAmbiente"
            })
            public static class Exclusao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00", required = true)
                protected TIdeAmbiente ideAmbiente;

                /**
                 * Gets the value of the ideAmbiente property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeAmbiente }
                 *     
                 */
                public TIdeAmbiente getIdeAmbiente() {
                    return ideAmbiente;
                }

                /**
                 * Sets the value of the ideAmbiente property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeAmbiente }
                 *     
                 */
                public void setIdeAmbiente(TIdeAmbiente value) {
                    this.ideAmbiente = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="ideAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00}TIdeAmbiente"/>
             *         &lt;element name="dadosAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00}TDadosAmbiente"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "ideAmbiente",
                "dadosAmbiente"
            })
            public static class Inclusao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00", required = true)
                protected TIdeAmbiente ideAmbiente;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_05_00", required = true)
                protected TDadosAmbiente dadosAmbiente;

                /**
                 * Gets the value of the ideAmbiente property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeAmbiente }
                 *     
                 */
                public TIdeAmbiente getIdeAmbiente() {
                    return ideAmbiente;
                }

                /**
                 * Sets the value of the ideAmbiente property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeAmbiente }
                 *     
                 */
                public void setIdeAmbiente(TIdeAmbiente value) {
                    this.ideAmbiente = value;
                }

                /**
                 * Gets the value of the dadosAmbiente property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TDadosAmbiente }
                 *     
                 */
                public TDadosAmbiente getDadosAmbiente() {
                    return dadosAmbiente;
                }

                /**
                 * Sets the value of the dadosAmbiente property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TDadosAmbiente }
                 *     
                 */
                public void setDadosAmbiente(TDadosAmbiente value) {
                    this.dadosAmbiente = value;
                }

            }

        }

    }

}
