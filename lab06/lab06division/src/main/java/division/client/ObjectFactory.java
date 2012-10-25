
package division.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the division.client package. 
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

    private final static QName _DivisionByZeroException_QNAME = new QName("http://testing/", "DivisionByZeroException");
    private final static QName _DivideResponse_QNAME = new QName("http://testing/", "divideResponse");
    private final static QName _Divide_QNAME = new QName("http://testing/", "divide");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: division.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Divide }
     * 
     */
    public Divide createDivide() {
        return new Divide();
    }

    /**
     * Create an instance of {@link DivisionByZeroException }
     * 
     */
    public DivisionByZeroException createDivisionByZeroException() {
        return new DivisionByZeroException();
    }

    /**
     * Create an instance of {@link DivideResponse }
     * 
     */
    public DivideResponse createDivideResponse() {
        return new DivideResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionByZeroException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://testing/", name = "DivisionByZeroException")
    public JAXBElement<DivisionByZeroException> createDivisionByZeroException(DivisionByZeroException value) {
        return new JAXBElement<DivisionByZeroException>(_DivisionByZeroException_QNAME, DivisionByZeroException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivideResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://testing/", name = "divideResponse")
    public JAXBElement<DivideResponse> createDivideResponse(DivideResponse value) {
        return new JAXBElement<DivideResponse>(_DivideResponse_QNAME, DivideResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Divide }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://testing/", name = "divide")
    public JAXBElement<Divide> createDivide(Divide value) {
        return new JAXBElement<Divide>(_Divide_QNAME, Divide.class, null, value);
    }

}
