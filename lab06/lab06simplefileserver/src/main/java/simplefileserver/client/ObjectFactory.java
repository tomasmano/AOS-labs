
package simplefileserver.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the simplefileserver.client package. 
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

    private final static QName _NoSuchFile_QNAME = new QName("http://j2ee.netbeans.org/wsdl/lab06simplefileserver/java/simple-file-server", "NoSuchFile");
    private final static QName _BinaryFile_QNAME = new QName("http://j2ee.netbeans.org/wsdl/lab06simplefileserver/java/simple-file-server", "BinaryFile");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: simplefileserver.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BinaryFile }
     * 
     */
    public BinaryFile createBinaryFile() {
        return new BinaryFile();
    }

    /**
     * Create an instance of {@link NoSuchFileException }
     * 
     */
    public NoSuchFileException createNoSuchFileException() {
        return new NoSuchFileException();
    }

    /**
     * Create an instance of {@link StringArray }
     * 
     */
    public StringArray createStringArray() {
        return new StringArray();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoSuchFileException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j2ee.netbeans.org/wsdl/lab06simplefileserver/java/simple-file-server", name = "NoSuchFile")
    public JAXBElement<NoSuchFileException> createNoSuchFile(NoSuchFileException value) {
        return new JAXBElement<NoSuchFileException>(_NoSuchFile_QNAME, NoSuchFileException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j2ee.netbeans.org/wsdl/lab06simplefileserver/java/simple-file-server", name = "BinaryFile")
    public JAXBElement<BinaryFile> createBinaryFile(BinaryFile value) {
        return new JAXBElement<BinaryFile>(_BinaryFile_QNAME, BinaryFile.class, null, value);
    }

}