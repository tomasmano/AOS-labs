
package edu.tomy.aoslab04;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.tomy.aoslab04 package. 
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

    private final static QName _GetSum_QNAME = new QName("http://aoslab04.tomy.edu/", "getSum");
    private final static QName _GetSumResponse_QNAME = new QName("http://aoslab04.tomy.edu/", "getSumResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.tomy.aoslab04
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSumResponse }
     * 
     */
    public GetSumResponse createGetSumResponse() {
        return new GetSumResponse();
    }

    /**
     * Create an instance of {@link GetSum }
     * 
     */
    public GetSum createGetSum() {
        return new GetSum();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aoslab04.tomy.edu/", name = "getSum")
    public JAXBElement<GetSum> createGetSum(GetSum value) {
        return new JAXBElement<GetSum>(_GetSum_QNAME, GetSum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aoslab04.tomy.edu/", name = "getSumResponse")
    public JAXBElement<GetSumResponse> createGetSumResponse(GetSumResponse value) {
        return new JAXBElement<GetSumResponse>(_GetSumResponse_QNAME, GetSumResponse.class, null, value);
    }

}
