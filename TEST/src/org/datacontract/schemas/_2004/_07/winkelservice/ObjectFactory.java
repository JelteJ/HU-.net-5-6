
package org.datacontract.schemas._2004._07.winkelservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.winkelservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Customer_QNAME = new QName("http://schemas.datacontract.org/2004/07/WinkelService", "Customer");
    private final static QName _Product_QNAME = new QName("http://schemas.datacontract.org/2004/07/WinkelService", "Product");
    private final static QName _BoughtProduct_QNAME = new QName("http://schemas.datacontract.org/2004/07/WinkelService", "BoughtProduct");
    private final static QName _ArrayOfBoughtProduct_QNAME = new QName("http://schemas.datacontract.org/2004/07/WinkelService", "ArrayOfBoughtProduct");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.winkelservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfBoughtProduct }
     * 
     */
    public ArrayOfBoughtProduct createArrayOfBoughtProduct() {
        return new ArrayOfBoughtProduct();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link BoughtProduct }
     * 
     */
    public BoughtProduct createBoughtProduct() {
        return new BoughtProduct();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WinkelService", name = "Customer")
    public JAXBElement<Customer> createCustomer(Customer value) {
        return new JAXBElement<Customer>(_Customer_QNAME, Customer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WinkelService", name = "Product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BoughtProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WinkelService", name = "BoughtProduct")
    public JAXBElement<BoughtProduct> createBoughtProduct(BoughtProduct value) {
        return new JAXBElement<BoughtProduct>(_BoughtProduct_QNAME, BoughtProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBoughtProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WinkelService", name = "ArrayOfBoughtProduct")
    public JAXBElement<ArrayOfBoughtProduct> createArrayOfBoughtProduct(ArrayOfBoughtProduct value) {
        return new JAXBElement<ArrayOfBoughtProduct>(_ArrayOfBoughtProduct_QNAME, ArrayOfBoughtProduct.class, null, value);
    }

}
