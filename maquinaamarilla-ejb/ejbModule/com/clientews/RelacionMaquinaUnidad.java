
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
 *         &lt;element name="PMAQUINAIDRUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PUNIDRASTIDUNIDAD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PDOCUMENTOINSTALACIONA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "pmaquinaidrunt",
    "punidrastidunidad",
    "pdocumentoinstalaciona"
})
@XmlRootElement(name = "RelacionMaquinaUnidad")
public class RelacionMaquinaUnidad {

    @XmlElement(name = "PUSUARIO")
    protected String pusuario;
    @XmlElement(name = "PTOKEN")
    protected String ptoken;
    @XmlElement(name = "PMAQUINAIDRUNT")
    protected String pmaquinaidrunt;
    @XmlElement(name = "PUNIDRASTIDUNIDAD")
    protected String punidrastidunidad;
    @XmlElement(name = "PDOCUMENTOINSTALACIONA")
    protected String pdocumentoinstalaciona;

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
     * Gets the value of the pmaquinaidrunt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMAQUINAIDRUNT() {
        return pmaquinaidrunt;
    }

    /**
     * Sets the value of the pmaquinaidrunt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMAQUINAIDRUNT(String value) {
        this.pmaquinaidrunt = value;
    }

    /**
     * Gets the value of the punidrastidunidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPUNIDRASTIDUNIDAD() {
        return punidrastidunidad;
    }

    /**
     * Sets the value of the punidrastidunidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPUNIDRASTIDUNIDAD(String value) {
        this.punidrastidunidad = value;
    }

    /**
     * Gets the value of the pdocumentoinstalaciona property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDOCUMENTOINSTALACIONA() {
        return pdocumentoinstalaciona;
    }

    /**
     * Sets the value of the pdocumentoinstalaciona property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDOCUMENTOINSTALACIONA(String value) {
        this.pdocumentoinstalaciona = value;
    }

}
