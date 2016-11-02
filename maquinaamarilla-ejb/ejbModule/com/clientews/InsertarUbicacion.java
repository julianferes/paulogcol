
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
 *         &lt;element name="PIDTRAMA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PIDUNIDAD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PTIPTRANSM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PLONGITUD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PLATITUD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PVELOCIDAD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PDIRECCION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PFECHAGPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PEVENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PIGNICION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PPUERTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PODOMETRO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "pidtrama",
    "pidunidad",
    "ptiptransm",
    "plongitud",
    "platitud",
    "pvelocidad",
    "pdireccion",
    "pfechagps",
    "pevento",
    "pignicion",
    "pip",
    "ppuerto",
    "pstatus",
    "podometro"
})
@XmlRootElement(name = "InsertarUbicacion")
public class InsertarUbicacion {

    @XmlElement(name = "PUSUARIO")
    protected String pusuario;
    @XmlElement(name = "PTOKEN")
    protected String ptoken;
    @XmlElement(name = "PIDTRAMA")
    protected String pidtrama;
    @XmlElement(name = "PIDUNIDAD")
    protected String pidunidad;
    @XmlElement(name = "PTIPTRANSM")
    protected String ptiptransm;
    @XmlElement(name = "PLONGITUD")
    protected String plongitud;
    @XmlElement(name = "PLATITUD")
    protected String platitud;
    @XmlElement(name = "PVELOCIDAD")
    protected String pvelocidad;
    @XmlElement(name = "PDIRECCION")
    protected String pdireccion;
    @XmlElement(name = "PFECHAGPS")
    protected String pfechagps;
    @XmlElement(name = "PEVENTO")
    protected String pevento;
    @XmlElement(name = "PIGNICION")
    protected String pignicion;
    @XmlElement(name = "PIP")
    protected String pip;
    @XmlElement(name = "PPUERTO")
    protected String ppuerto;
    @XmlElement(name = "PSTATUS")
    protected String pstatus;
    @XmlElement(name = "PODOMETRO")
    protected String podometro;

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
     * Gets the value of the pidtrama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIDTRAMA() {
        return pidtrama;
    }

    /**
     * Sets the value of the pidtrama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIDTRAMA(String value) {
        this.pidtrama = value;
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
     * Gets the value of the ptiptransm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTIPTRANSM() {
        return ptiptransm;
    }

    /**
     * Sets the value of the ptiptransm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTIPTRANSM(String value) {
        this.ptiptransm = value;
    }

    /**
     * Gets the value of the plongitud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLONGITUD() {
        return plongitud;
    }

    /**
     * Sets the value of the plongitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLONGITUD(String value) {
        this.plongitud = value;
    }

    /**
     * Gets the value of the platitud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATITUD() {
        return platitud;
    }

    /**
     * Sets the value of the platitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATITUD(String value) {
        this.platitud = value;
    }

    /**
     * Gets the value of the pvelocidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPVELOCIDAD() {
        return pvelocidad;
    }

    /**
     * Sets the value of the pvelocidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPVELOCIDAD(String value) {
        this.pvelocidad = value;
    }

    /**
     * Gets the value of the pdireccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDIRECCION() {
        return pdireccion;
    }

    /**
     * Sets the value of the pdireccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDIRECCION(String value) {
        this.pdireccion = value;
    }

    /**
     * Gets the value of the pfechagps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPFECHAGPS() {
        return pfechagps;
    }

    /**
     * Sets the value of the pfechagps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFECHAGPS(String value) {
        this.pfechagps = value;
    }

    /**
     * Gets the value of the pevento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPEVENTO() {
        return pevento;
    }

    /**
     * Sets the value of the pevento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPEVENTO(String value) {
        this.pevento = value;
    }

    /**
     * Gets the value of the pignicion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIGNICION() {
        return pignicion;
    }

    /**
     * Sets the value of the pignicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIGNICION(String value) {
        this.pignicion = value;
    }

    /**
     * Gets the value of the pip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIP() {
        return pip;
    }

    /**
     * Sets the value of the pip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIP(String value) {
        this.pip = value;
    }

    /**
     * Gets the value of the ppuerto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPUERTO() {
        return ppuerto;
    }

    /**
     * Sets the value of the ppuerto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPUERTO(String value) {
        this.ppuerto = value;
    }

    /**
     * Gets the value of the pstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSTATUS() {
        return pstatus;
    }

    /**
     * Sets the value of the pstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSTATUS(String value) {
        this.pstatus = value;
    }

    /**
     * Gets the value of the podometro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPODOMETRO() {
        return podometro;
    }

    /**
     * Sets the value of the podometro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPODOMETRO(String value) {
        this.podometro = value;
    }

}
