
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.winkelservice.ArrayOfBoughtProduct;


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
 *         &lt;element name="getBoughtProductsResult" type="{http://schemas.datacontract.org/2004/07/WinkelService}ArrayOfBoughtProduct" minOccurs="0"/>
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
    "getBoughtProductsResult"
})
@XmlRootElement(name = "getBoughtProductsResponse")
public class GetBoughtProductsResponse {

    @XmlElement(nillable = true)
    protected ArrayOfBoughtProduct getBoughtProductsResult;

    /**
     * Gets the value of the getBoughtProductsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBoughtProduct }
     *     
     */
    public ArrayOfBoughtProduct getGetBoughtProductsResult() {
        return getBoughtProductsResult;
    }

    /**
     * Sets the value of the getBoughtProductsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBoughtProduct }
     *     
     */
    public void setGetBoughtProductsResult(ArrayOfBoughtProduct value) {
        this.getBoughtProductsResult = value;
    }

}
