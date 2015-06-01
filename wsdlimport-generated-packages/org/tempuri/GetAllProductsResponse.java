
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.winkelservice.ArrayOfProduct;


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
 *         &lt;element name="getAllProductsResult" type="{http://schemas.datacontract.org/2004/07/WinkelService}ArrayOfProduct" minOccurs="0"/>
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
    "getAllProductsResult"
})
@XmlRootElement(name = "getAllProductsResponse")
public class GetAllProductsResponse {

    @XmlElement(nillable = true)
    protected ArrayOfProduct getAllProductsResult;

    /**
     * Gets the value of the getAllProductsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProduct }
     *     
     */
    public ArrayOfProduct getGetAllProductsResult() {
        return getAllProductsResult;
    }

    /**
     * Sets the value of the getAllProductsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProduct }
     *     
     */
    public void setGetAllProductsResult(ArrayOfProduct value) {
        this.getAllProductsResult = value;
    }

}
