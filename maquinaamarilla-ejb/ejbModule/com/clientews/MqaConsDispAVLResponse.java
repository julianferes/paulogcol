
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
 *         &lt;element name="MqaConsDispAVLResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "mqaConsDispAVLResult"
})
@XmlRootElement(name = "MqaConsDispAVLResponse")
public class MqaConsDispAVLResponse {

    @XmlElement(name = "MqaConsDispAVLResult")
    protected String mqaConsDispAVLResult;

    /**
     * Gets the value of the mqaConsDispAVLResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMqaConsDispAVLResult() {
        return mqaConsDispAVLResult;
    }

    /**
     * Sets the value of the mqaConsDispAVLResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMqaConsDispAVLResult(String value) {
        this.mqaConsDispAVLResult = value;
    }

}
