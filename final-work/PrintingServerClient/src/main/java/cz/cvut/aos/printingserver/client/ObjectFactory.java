
package cz.cvut.aos.printingserver.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cz.cvut.aos.printingserver.client package. 
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

    private final static QName _PrintAirTicket_QNAME = new QName("http://webservice.printingserver.aos.cvut.cz/", "printAirTicket");
    private final static QName _PrintAirTicketResponse_QNAME = new QName("http://webservice.printingserver.aos.cvut.cz/", "printAirTicketResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cz.cvut.aos.printingserver.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PrintAirTicketResponse }
     * 
     */
    public PrintAirTicketResponse createPrintAirTicketResponse() {
        return new PrintAirTicketResponse();
    }

    /**
     * Create an instance of {@link PrintAirTicket }
     * 
     */
    public PrintAirTicket createPrintAirTicket() {
        return new PrintAirTicket();
    }

    /**
     * Create an instance of {@link Flight }
     * 
     */
    public Flight createFlight() {
        return new Flight();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link AirTicketCopy }
     * 
     */
    public AirTicketCopy createAirTicketCopy() {
        return new AirTicketCopy();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintAirTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.printingserver.aos.cvut.cz/", name = "printAirTicket")
    public JAXBElement<PrintAirTicket> createPrintAirTicket(PrintAirTicket value) {
        return new JAXBElement<PrintAirTicket>(_PrintAirTicket_QNAME, PrintAirTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintAirTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.printingserver.aos.cvut.cz/", name = "printAirTicketResponse")
    public JAXBElement<PrintAirTicketResponse> createPrintAirTicketResponse(PrintAirTicketResponse value) {
        return new JAXBElement<PrintAirTicketResponse>(_PrintAirTicketResponse_QNAME, PrintAirTicketResponse.class, null, value);
    }

}
