
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.winkelservice.ArrayOfProduct;
import org.datacontract.schemas._2004._07.winkelservice.Product;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _AddProductName_QNAME = new QName("http://tempuri.org/", "name");
    private final static QName _GetProductByIdResponseGetProductByIdResult_QNAME = new QName("http://tempuri.org/", "getProductByIdResult");
    private final static QName _GetAllProductsResponseGetAllProductsResult_QNAME = new QName("http://tempuri.org/", "getAllProductsResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllProducts }
     * 
     */
    public GetAllProducts createGetAllProducts() {
        return new GetAllProducts();
    }

    /**
     * Create an instance of {@link AddProduct }
     * 
     */
    public AddProduct createAddProduct() {
        return new AddProduct();
    }

    /**
     * Create an instance of {@link AddProductResponse }
     * 
     */
    public AddProductResponse createAddProductResponse() {
        return new AddProductResponse();
    }

    /**
     * Create an instance of {@link GetProductByIdResponse }
     * 
     */
    public GetProductByIdResponse createGetProductByIdResponse() {
        return new GetProductByIdResponse();
    }

    /**
     * Create an instance of {@link GetProductById }
     * 
     */
    public GetProductById createGetProductById() {
        return new GetProductById();
    }

    /**
     * Create an instance of {@link GetAllProductsResponse }
     * 
     */
    public GetAllProductsResponse createGetAllProductsResponse() {
        return new GetAllProductsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "name", scope = AddProduct.class)
    public JAXBElement<String> createAddProductName(String value) {
        return new JAXBElement<String>(_AddProductName_QNAME, String.class, AddProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getProductByIdResult", scope = GetProductByIdResponse.class)
    public JAXBElement<Product> createGetProductByIdResponseGetProductByIdResult(Product value) {
        return new JAXBElement<Product>(_GetProductByIdResponseGetProductByIdResult_QNAME, Product.class, GetProductByIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getAllProductsResult", scope = GetAllProductsResponse.class)
    public JAXBElement<ArrayOfProduct> createGetAllProductsResponseGetAllProductsResult(ArrayOfProduct value) {
        return new JAXBElement<ArrayOfProduct>(_GetAllProductsResponseGetAllProductsResult_QNAME, ArrayOfProduct.class, GetAllProductsResponse.class, value);
    }

}
