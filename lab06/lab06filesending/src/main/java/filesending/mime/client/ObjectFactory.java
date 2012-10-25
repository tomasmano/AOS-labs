
package filesending.mime.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the filesending.mime.client package. 
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

    private final static QName _SendFileResponse_QNAME = new QName("http://testing/", "sendFileResponse");
    private final static QName _SendFile_QNAME = new QName("http://testing/", "sendFile");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: filesending.mime.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendFile }
     * 
     */
    public SendFile createSendFile() {
        return new SendFile();
    }

    /**
     * Create an instance of {@link SendFileResponse }
     * 
     */
    public SendFileResponse createSendFileResponse() {
        return new SendFileResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://testing/", name = "sendFileResponse")
    public JAXBElement<SendFileResponse> createSendFileResponse(SendFileResponse value) {
        return new JAXBElement<SendFileResponse>(_SendFileResponse_QNAME, SendFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://testing/", name = "sendFile")
    public JAXBElement<SendFile> createSendFile(SendFile value) {
        return new JAXBElement<SendFile>(_SendFile_QNAME, SendFile.class, null, value);
    }

}
