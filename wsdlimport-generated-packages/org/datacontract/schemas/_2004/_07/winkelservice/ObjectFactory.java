
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
    private final static QName _ArrayOfProduct_QNAME = new QName("http://schemas.datacontract.org/2004/07/WinkelService", "ArrayOfProduct");
    private final static QName _ArrayOfBoughtProduct_QNAME = new QName("http://schemas.datacontract.org/2004/07/WinkelService", "ArrayOfBoughtProduct");
    private final static QName _CustomerPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/WinkelService", "password");
    private final static QName _CustomerBoughtProducts_QNAME = new QName("http://schemas.datacontract.org/2004/07/WinkelService", "BoughtProducts");
    private final static QName _CustomerUsername_QNAME = new QName("http://schemas.datacontract.org/2004/07/WinkelService", "username");
    private final static QName _ProductName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WinkelService", "name");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.winkelservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link ArrayOfProduct }
     * 
     */
    public ArrayOfProduct createArrayOfProduct() {
        return new ArrayOfProduct();
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
     * Create an instance of {@link ArrayOfBoughtProduct }
     * 
     */
    public ArrayOfBoughtProduct createArrayOfBoughtProduct() {
        return new ArrayOfBoughtProduct();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WinkelService", name = "ArrayOfProduct")
    public JAXBElement<ArrayOfProduct> createArrayOfProduct(ArrayOfProduct value) {
        return new JAXBElement<ArrayOfProduct>(_ArrayOfProduct_QNAME, ArrayOfProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBoughtProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WinkelService", name = "ArrayOfBoughtProduct")
    public JAXBElement<ArrayOfBoughtProduct> createArrayOfBoughtProduct(ArrayOfBoughtProduct value) {
        return new JAXBElement<ArrayOfBoughtProduct>(_ArrayOfBoughtProduct_QNAME, ArrayOfBoughtProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WinkelService", name = "Customer", scope = BoughtProduct.class)
    public JAXBElement<Customer> createBoughtProductCustomer(Customer value) {
        return new JAXBElement<Customer>(_Customer_QNAME, Customer.class, BoughtProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WinkelService", name = "Product", scope = BoughtProduct.class)
    public JAXBElement<Product> createBoughtProductProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, BoughtProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WinkelService", name = "password", scope = Customer.class)
    public JAXBElement<String> createCustomerPassword(String value) {
        return new JAXBElement<String>(_CustomerPassword_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBoughtProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WinkelService", name = "BoughtProducts", scope = Customer.class)
    public JAXBElement<ArrayOfBoughtProduct> createCustomerBoughtProducts(ArrayOfBoughtProduct value) {
        return new JAXBElement<ArrayOfBoughtProduct>(_CustomerBoughtProducts_QNAME, ArrayOfBoughtProduct.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WinkelService", name = "username", scope = Customer.class)
    public JAXBElement<String> createCustomerUsername(String value) {
        return new JAXBElement<String>(_CustomerUsername_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBoughtProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WinkelService", name = "BoughtProducts", scope = Product.class)
    public JAXBElement<ArrayOfBoughtProduct> createProductBoughtProducts(ArrayOfBoughtProduct value) {
        return new JAXBElement<ArrayOfBoughtProduct>(_CustomerBoughtProducts_QNAME, ArrayOfBoughtProduct.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WinkelService", name = "name", scope = Product.class)
    public JAXBElement<String> createProductName(String value) {
        return new JAXBElement<String>(_ProductName_QNAME, String.class, Product.class, value);
    }

}
