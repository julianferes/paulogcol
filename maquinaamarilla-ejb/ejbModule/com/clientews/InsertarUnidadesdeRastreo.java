
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
 *         &lt;element name="PIDUNIDAD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PCODIMARCA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PCODILINEA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PIMEI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PTARJETA_SIM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PNRO_MOVIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POPERADORMOVIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POPERADORSATELITAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POBSERVACION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PSERIE_DISPOSITIVO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "pidunidad",
    "pcodimarca",
    "pcodilinea",
    "pimei",
    "ptarjetasim",
    "pnromovil",
    "poperadormovil",
    "poperadorsatelital",
    "pobservacion",
    "pseriedispositivo"
})
@XmlRootElement(name = "InsertarUnidadesdeRastreo")
public class InsertarUnidadesdeRastreo {

    @XmlElement(name = "PUSUARIO")
    protected String pusuario;
    @XmlElement(name = "PTOKEN")
    protected String ptoken;
    @XmlElement(name = "PIDUNIDAD")
    protected String pidunidad;
    @XmlElement(name = "PCODIMARCA")
    protected String pcodimarca;
    @XmlElement(name = "PCODILINEA")
    protected String pcodilinea;
    @XmlElement(name = "PIMEI")
    protected String pimei;
    @XmlElement(name = "PTARJETA_SIM")
    protected String ptarjetasim;
    @XmlElement(name = "PNRO_MOVIL")
    protected String pnromovil;
    @XmlElement(name = "POPERADORMOVIL")
    protected String poperadormovil;
    @XmlElement(name = "POPERADORSATELITAL")
    protected String poperadorsatelital;
    @XmlElement(name = "POBSERVACION")
    protected String pobservacion;
    @XmlElement(name = "PSERIE_DISPOSITIVO")
    protected String pseriedispositivo;

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
     * Gets the value of the pidunidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIDUNIDAD() {
        return pidunidad;
    }

    /**
     * Sets the value of the pidunidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIDUNIDAD(String value) {
        this.pidunidad = value;
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
     * Gets the value of the pimei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIMEI() {
        return pimei;
    }

    /**
     * Sets the value of the pimei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIMEI(String value) {
        this.pimei = value;
    }

    /**
     * Gets the value of the ptarjetasim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTARJETASIM() {
        return ptarjetasim;
    }

    /**
     * Sets the value of the ptarjetasim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTARJETASIM(String value) {
        this.ptarjetasim = value;
    }

    /**
     * Gets the value of the pnromovil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNROMOVIL() {
        return pnromovil;
    }

    /**
     * Sets the value of the pnromovil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNROMOVIL(String value) {
        this.pnromovil = value;
    }

    /**
     * Gets the value of the poperadormovil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOPERADORMOVIL() {
        return poperadormovil;
    }

    /**
     * Sets the value of the poperadormovil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOPERADORMOVIL(String value) {
        this.poperadormovil = value;
    }

    /**
     * Gets the value of the poperadorsatelital property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOPERADORSATELITAL() {
        return poperadorsatelital;
    }

    /**
     * Sets the value of the poperadorsatelital property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOPERADORSATELITAL(String value) {
        this.poperadorsatelital = value;
    }

    /**
     * Gets the value of the pobservacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBSERVACION() {
        return pobservacion;
    }

    /**
     * Sets the value of the pobservacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBSERVACION(String value) {
        this.pobservacion = value;
    }

    /**
     * Gets the value of the pseriedispositivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSERIEDISPOSITIVO() {
        return pseriedispositivo;
    }

    /**
     * Sets the value of the pseriedispositivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSERIEDISPOSITIVO(String value) {
        this.pseriedispositivo = value;
    }

}
