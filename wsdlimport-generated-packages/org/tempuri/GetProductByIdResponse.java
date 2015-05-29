
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.winkelservice.Product;


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
 *         &lt;element name="getProductByIdResult" type="{http://schemas.datacontract.org/2004/07/WinkelService}Product" minOccurs="0"/>
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
    "getProductByIdResult"
})
@XmlRootElement(name = "getProductByIdResponse")
public class GetProductByIdResponse {

    @XmlElementRef(name = "getProductByIdResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Product> getProductByIdResult;

    /**
     * Gets the value of the getProductByIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Product }{@code >}
     *     
     */
    public JAXBElement<Product> getGetProductByIdResult() {
        return getProductByIdResult;
    }

    /**
     * Sets the value of the getProductByIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Product }{@code >}
     *     
     */
    public void setGetProductByIdResult(JAXBElement<Product> value) {
        this.getProductByIdResult = value;
    }

}
