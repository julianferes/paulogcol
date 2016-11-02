
package com.clientews;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="PUSUARIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PTOKEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PIDRUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PSERIE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PCODIMARCA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PCODILINEA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PMODELO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PTIPOMAQUINA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PIDUNIDADVIGENTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PMOTOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PCHASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PTIPOUNIDADMAQUINA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "pusuario",
    "ptoken",
    "pidrunt",
    "pserie",
    "pcodimarca",
    "pcodilinea",
    "pmodelo",
    "ptipomaquina",
    "pidunidadvigente",
    "pmotor",
    "pchasis",
    "ptipounidadmaquina"
})
@XmlRootElement(name = "InsertarMaquinas")
public class InsertarMaquinas {

    @XmlElement(name = "PUSUARIO")
    protected String pusuario;
    @XmlElement(name = "PTOKEN")
    protected String ptoken;
    @XmlElement(name = "PIDRUNT")
    protected String pidrunt;
    @XmlElement(name = "PSERIE")
    protected String pserie;
    @XmlElement(name = "PCODIMARCA")
    protected String pcodimarca;
    @XmlElement(name = "PCODILINEA")
    protected String pcodilinea;
    @XmlElement(name = "PMODELO")
    protected String pmodelo;
    @XmlElement(name = "PTIPOMAQUINA")
    protected String ptipomaquina;
    @XmlElement(name = "PIDUNIDADVIGENTE")
    protected String pidunidadvigente;
    @XmlElement(name = "PMOTOR")
    protected String pmotor;
    @XmlElement(name = "PCHASIS")
    protected String pchasis;
    @XmlElement(name = "PTIPOUNIDADMAQUINA")
    protected String ptipounidadmaquina;

    /**
     * Gets the value of the pusuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPUSUARIO() {
        return pusuario;
    }

    /**
     * Sets the value of the pusuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPUSUARIO(String value) {
        this.pusuario = value;
    }

    /**
     * Gets the value of the ptoken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTOKEN() {
        return ptoken;
    }

    /**
     * Sets the value of the ptoken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTOKEN(String value) {
        this.ptoken = value;
    }

    /**
     * Gets the value of the pidrunt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIDRUNT() {
        return pidrunt;
    }

    /**
     * Sets the value of the pidrunt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIDRUNT(String value) {
        this.pidrunt = value;
    }

    /**
     * Gets the value of the pserie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSERIE() {
        return pserie;
    }

    /**
     * Sets the value of the pserie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSERIE(String value) {
        this.pserie = value;
    }

    /**
     * Gets the value of the pcodimarca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCODIMARCA() {
        return pcodimarca;
    }

    /**
     * Sets the value of the pcodimarca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCODIMARCA(String value) {
        this.pcodimarca = value;
    }

    /**
     * Gets the value of the pcodilinea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCODILINEA() {
        return pcodilinea;
    }

    /**
     * Sets the value of the pcodilinea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCODILINEA(String value) {
        this.pcodilinea = value;
    }

    /**
     * Gets the value of the pmodelo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMODELO() {
        return pmodelo;
    }

    /**
     * Sets the value of the pmodelo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMODELO(String value) {
        this.pmodelo = value;
    }

    /**
     * Gets the value of the ptipomaquina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTIPOMAQUINA() {
        return ptipomaquina;
    }

    /**
     * Sets the value of the ptipomaquina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTIPOMAQUINA(String value) {
        this.ptipomaquina = value;
    }

    /**
     * Gets the value of the pidunidadvigente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIDUNIDADVIGENTE() {
        return pidunidadvigente;
    }

    /**
     * Sets the value of the pidunidadvigente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIDUNIDADVIGENTE(String value) {
        this.pidunidadvigente = value;
    }

    /**
     * Gets the value of the pmotor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMOTOR() {
        return pmotor;
    }

    /**
     * Sets the value of the pmotor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMOTOR(String value) {
        this.pmotor = value;
    }

    /**
     * Gets the value of the pchasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCHASIS() {
        return pchasis;
    }

    /**
     * Sets the value of the pchasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCHASIS(String value) {
        this.pchasis = value;
    }

    /**
     * Gets the value of the ptipounidadmaquina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTIPOUNIDADMAQUINA() {
        return ptipounidadmaquina;
    }

    /**
     * Sets the value of the ptipounidadmaquina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTIPOUNIDADMAQUINA(String value) {
        this.ptipounidadmaquina = value;
    }

}
