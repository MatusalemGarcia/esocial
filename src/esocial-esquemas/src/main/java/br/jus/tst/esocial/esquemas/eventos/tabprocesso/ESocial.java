//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.09 at 02:26:46 PM BRST 
//


package br.jus.tst.esocial.esquemas.eventos.tabprocesso;

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
 *         &lt;element name="evtTabProcesso">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00}TIdeCadastro"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00}TEmpregador"/>
 *                   &lt;element name="infoProcesso">
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
 *                                         &lt;element name="ideProcesso" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00}TIdeProcesso"/>
 *                                         &lt;element name="dadosProc" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00}TDadosProc"/>
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
 *                                         &lt;element name="ideProcesso" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00}TIdeProcesso"/>
 *                                         &lt;element name="dadosProc" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00}TDadosProc"/>
 *                                         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00}TPeriodoValidade" minOccurs="0"/>
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
 *                                         &lt;element name="ideProcesso" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00}TIdeProcesso"/>
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
    "evtTabProcesso",
    "signature"
})
@XmlRootElement(name = "eSocial", namespace = "http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00")
public class ESocial {

    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00", required = true)
    protected ESocial.EvtTabProcesso evtTabProcesso;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;

    /**
     * Gets the value of the evtTabProcesso property.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtTabProcesso }
     *     
     */
    public ESocial.EvtTabProcesso getEvtTabProcesso() {
        return evtTabProcesso;
    }

    /**
     * Sets the value of the evtTabProcesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtTabProcesso }
     *     
     */
    public void setEvtTabProcesso(ESocial.EvtTabProcesso value) {
        this.evtTabProcesso = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00}TIdeCadastro"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00}TEmpregador"/>
     *         &lt;element name="infoProcesso">
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
     *                               &lt;element name="ideProcesso" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00}TIdeProcesso"/>
     *                               &lt;element name="dadosProc" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00}TDadosProc"/>
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
     *                               &lt;element name="ideProcesso" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00}TIdeProcesso"/>
     *                               &lt;element name="dadosProc" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00}TDadosProc"/>
     *                               &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00}TPeriodoValidade" minOccurs="0"/>
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
     *                               &lt;element name="ideProcesso" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00}TIdeProcesso"/>
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
        "infoProcesso"
    })
    public static class EvtTabProcesso {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00", required = true)
        protected TIdeCadastro ideEvento;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00", required = true)
        protected TEmpregador ideEmpregador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00", required = true)
        protected ESocial.EvtTabProcesso.InfoProcesso infoProcesso;
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
         * Gets the value of the infoProcesso property.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtTabProcesso.InfoProcesso }
         *     
         */
        public ESocial.EvtTabProcesso.InfoProcesso getInfoProcesso() {
            return infoProcesso;
        }

        /**
         * Sets the value of the infoProcesso property.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtTabProcesso.InfoProcesso }
         *     
         */
        public void setInfoProcesso(ESocial.EvtTabProcesso.InfoProcesso value) {
            this.infoProcesso = value;
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
         *                     &lt;element name="ideProcesso" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00}TIdeProcesso"/>
         *                     &lt;element name="dadosProc" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00}TDadosProc"/>
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
         *                     &lt;element name="ideProcesso" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00}TIdeProcesso"/>
         *                     &lt;element name="dadosProc" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00}TDadosProc"/>
         *                     &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00}TPeriodoValidade" minOccurs="0"/>
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
         *                     &lt;element name="ideProcesso" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00}TIdeProcesso"/>
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
        public static class InfoProcesso {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00")
            protected ESocial.EvtTabProcesso.InfoProcesso.Inclusao inclusao;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00")
            protected ESocial.EvtTabProcesso.InfoProcesso.Alteracao alteracao;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00")
            protected ESocial.EvtTabProcesso.InfoProcesso.Exclusao exclusao;

            /**
             * Gets the value of the inclusao property.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabProcesso.InfoProcesso.Inclusao }
             *     
             */
            public ESocial.EvtTabProcesso.InfoProcesso.Inclusao getInclusao() {
                return inclusao;
            }

            /**
             * Sets the value of the inclusao property.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabProcesso.InfoProcesso.Inclusao }
             *     
             */
            public void setInclusao(ESocial.EvtTabProcesso.InfoProcesso.Inclusao value) {
                this.inclusao = value;
            }

            /**
             * Gets the value of the alteracao property.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabProcesso.InfoProcesso.Alteracao }
             *     
             */
            public ESocial.EvtTabProcesso.InfoProcesso.Alteracao getAlteracao() {
                return alteracao;
            }

            /**
             * Sets the value of the alteracao property.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabProcesso.InfoProcesso.Alteracao }
             *     
             */
            public void setAlteracao(ESocial.EvtTabProcesso.InfoProcesso.Alteracao value) {
                this.alteracao = value;
            }

            /**
             * Gets the value of the exclusao property.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabProcesso.InfoProcesso.Exclusao }
             *     
             */
            public ESocial.EvtTabProcesso.InfoProcesso.Exclusao getExclusao() {
                return exclusao;
            }

            /**
             * Sets the value of the exclusao property.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabProcesso.InfoProcesso.Exclusao }
             *     
             */
            public void setExclusao(ESocial.EvtTabProcesso.InfoProcesso.Exclusao value) {
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
             *         &lt;element name="ideProcesso" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00}TIdeProcesso"/>
             *         &lt;element name="dadosProc" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00}TDadosProc"/>
             *         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00}TPeriodoValidade" minOccurs="0"/>
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
                "ideProcesso",
                "dadosProc",
                "novaValidade"
            })
            public static class Alteracao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00", required = true)
                protected TIdeProcesso ideProcesso;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00", required = true)
                protected TDadosProc dadosProc;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00")
                protected TPeriodoValidade novaValidade;

                /**
                 * Gets the value of the ideProcesso property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeProcesso }
                 *     
                 */
                public TIdeProcesso getIdeProcesso() {
                    return ideProcesso;
                }

                /**
                 * Sets the value of the ideProcesso property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeProcesso }
                 *     
                 */
                public void setIdeProcesso(TIdeProcesso value) {
                    this.ideProcesso = value;
                }

                /**
                 * Gets the value of the dadosProc property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TDadosProc }
                 *     
                 */
                public TDadosProc getDadosProc() {
                    return dadosProc;
                }

                /**
                 * Sets the value of the dadosProc property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TDadosProc }
                 *     
                 */
                public void setDadosProc(TDadosProc value) {
                    this.dadosProc = value;
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
             *         &lt;element name="ideProcesso" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00}TIdeProcesso"/>
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
                "ideProcesso"
            })
            public static class Exclusao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00", required = true)
                protected TIdeProcesso ideProcesso;

                /**
                 * Gets the value of the ideProcesso property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeProcesso }
                 *     
                 */
                public TIdeProcesso getIdeProcesso() {
                    return ideProcesso;
                }

                /**
                 * Sets the value of the ideProcesso property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeProcesso }
                 *     
                 */
                public void setIdeProcesso(TIdeProcesso value) {
                    this.ideProcesso = value;
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
             *         &lt;element name="ideProcesso" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00}TIdeProcesso"/>
             *         &lt;element name="dadosProc" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00}TDadosProc"/>
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
                "ideProcesso",
                "dadosProc"
            })
            public static class Inclusao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00", required = true)
                protected TIdeProcesso ideProcesso;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00", required = true)
                protected TDadosProc dadosProc;

                /**
                 * Gets the value of the ideProcesso property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeProcesso }
                 *     
                 */
                public TIdeProcesso getIdeProcesso() {
                    return ideProcesso;
                }

                /**
                 * Sets the value of the ideProcesso property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeProcesso }
                 *     
                 */
                public void setIdeProcesso(TIdeProcesso value) {
                    this.ideProcesso = value;
                }

                /**
                 * Gets the value of the dadosProc property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TDadosProc }
                 *     
                 */
                public TDadosProc getDadosProc() {
                    return dadosProc;
                }

                /**
                 * Sets the value of the dadosProc property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TDadosProc }
                 *     
                 */
                public void setDadosProc(TDadosProc value) {
                    this.dadosProc = value;
                }

            }

        }

    }

}
