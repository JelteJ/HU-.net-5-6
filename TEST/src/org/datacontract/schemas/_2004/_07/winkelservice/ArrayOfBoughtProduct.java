
package org.datacontract.schemas._2004._07.winkelservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBoughtProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBoughtProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BoughtProduct" type="{http://schemas.datacontract.org/2004/07/WinkelService}BoughtProduct" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBoughtProduct", propOrder = {
    "boughtProduct"
})
public class ArrayOfBoughtProduct {

    @XmlElement(name = "BoughtProduct", nillable = true)
    protected List<BoughtProduct> boughtProduct;

    /**
     * Gets the value of the boughtProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boughtProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoughtProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BoughtProduct }
     * 
     * 
     */
    public List<BoughtProduct> getBoughtProduct() {
        if (boughtProduct == null) {
            boughtProduct = new ArrayList<BoughtProduct>();
        }
        return this.boughtProduct;
    }

}
