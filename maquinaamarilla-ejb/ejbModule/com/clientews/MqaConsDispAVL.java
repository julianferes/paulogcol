
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
 *         &lt;element name="PMQASERIE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PMQAMOTOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PMQACHASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PDISIMEI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PTIDPROV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PIDEPROV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "pmqaserie",
    "pmqamotor",
    "pmqachasis",
    "pdisimei",
    "ptidprov",
    "pideprov"
})
@XmlRootElement(name = "MqaConsDispAVL")
public class MqaConsDispAVL {

    @XmlElement(name = "PUSUARIO")
    protected String pusuario;
    @XmlElement(name = "PTOKEN")
    protected String ptoken;
    @XmlElement(name = "PMQASERIE")
    protected String pmqaserie;
    @XmlElement(name = "PMQAMOTOR")
    protected String pmqamotor;
    @XmlElement(name = "PMQACHASIS")
    protected String pmqachasis;
    @XmlElement(name = "PDISIMEI")
    protected String pdisimei;
    @XmlElement(name = "PTIDPROV")
    protected String ptidprov;
    @XmlElement(name = "PIDEPROV")
    protected String pideprov;

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
     * Gets the value of the pmqaserie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMQASERIE() {
        return pmqaserie;
    }

    /**
     * Sets the value of the pmqaserie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMQASERIE(String value) {
        this.pmqaserie = value;
    }

    /**
     * Gets the value of the pmqamotor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMQAMOTOR() {
        return pmqamotor;
    }

    /**
     * Sets the value of the pmqamotor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMQAMOTOR(String value) {
        this.pmqamotor = value;
    }

    /**
     * Gets the value of the pmqachasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMQACHASIS() {
        return pmqachasis;
    }

    /**
     * Sets the value of the pmqachasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMQACHASIS(String value) {
        this.pmqachasis = value;
    }

    /**
     * Gets the value of the pdisimei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDISIMEI() {
        return pdisimei;
    }

    /**
     * Sets the value of the pdisimei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDISIMEI(String value) {
        this.pdisimei = value;
    }

    /**
     * Gets the value of the ptidprov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTIDPROV() {
        return ptidprov;
    }

    /**
     * Sets the value of the ptidprov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTIDPROV(String value) {
        this.ptidprov = value;
    }

    /**
     * Gets the value of the pideprov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIDEPROV() {
        return pideprov;
    }

    /**
     * Sets the value of the pideprov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIDEPROV(String value) {
        this.pideprov = value;
    }

}
