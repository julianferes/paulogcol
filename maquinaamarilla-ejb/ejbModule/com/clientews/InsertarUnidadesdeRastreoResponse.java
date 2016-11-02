
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
 *         &lt;element name="InsertarUnidadesdeRastreoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "insertarUnidadesdeRastreoResult"
})
@XmlRootElement(name = "InsertarUnidadesdeRastreoResponse")
public class InsertarUnidadesdeRastreoResponse {

    @XmlElement(name = "InsertarUnidadesdeRastreoResult")
    protected String insertarUnidadesdeRastreoResult;

    /**
     * Gets the value of the insertarUnidadesdeRastreoResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertarUnidadesdeRastreoResult() {
        return insertarUnidadesdeRastreoResult;
    }

    /**
     * Sets the value of the insertarUnidadesdeRastreoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertarUnidadesdeRastreoResult(String value) {
        this.insertarUnidadesdeRastreoResult = value;
    }

}
