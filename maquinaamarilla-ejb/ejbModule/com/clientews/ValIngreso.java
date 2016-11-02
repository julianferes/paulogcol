
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
 *         &lt;element name="PUSUARIOPROV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PCLAVEPROV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PNUMEROVALIDO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "pusuarioprov",
    "pclaveprov",
    "pnumerovalido"
})
@XmlRootElement(name = "ValIngreso")
public class ValIngreso {

    @XmlElement(name = "PUSUARIOPROV")
    protected String pusuarioprov;
    @XmlElement(name = "PCLAVEPROV")
    protected String pclaveprov;
    @XmlElement(name = "PNUMEROVALIDO")
    protected String pnumerovalido;

    /**
     * Gets the value of the pusuarioprov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPUSUARIOPROV() {
        return pusuarioprov;
    }

    /**
     * Sets the value of the pusuarioprov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPUSUARIOPROV(String value) {
        this.pusuarioprov = value;
    }

    /**
     * Gets the value of the pclaveprov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCLAVEPROV() {
        return pclaveprov;
    }

    /**
     * Sets the value of the pclaveprov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCLAVEPROV(String value) {
        this.pclaveprov = value;
    }

    /**
     * Gets the value of the pnumerovalido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNUMEROVALIDO() {
        return pnumerovalido;
    }

    /**
     * Sets the value of the pnumerovalido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNUMEROVALIDO(String value) {
        this.pnumerovalido = value;
    }

}
