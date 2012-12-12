
package cz.cvut.aos.flyingcompany.generatedcode.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cz.cvut.aos.flyingcompany.generatedcode.client package. 
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

    private final static QName _FlightCapacityExceededException_QNAME = new QName("http://webservice.interfaceserver.aos.cvut.cz/", "FlightCapacityExceededException");
    private final static QName _SeatNotAvailable_QNAME = new QName("http://webservice.interfaceserver.aos.cvut.cz/", "SeatNotAvailable");
    private final static QName _UnsupportedPaymentTypeException_QNAME = new QName("http://webservice.interfaceserver.aos.cvut.cz/", "UnsupportedPaymentTypeException");
    private final static QName _CancelFlightResponse_QNAME = new QName("http://webservice.interfaceserver.aos.cvut.cz/", "cancelFlightResponse");
    private final static QName _PrintingException_QNAME = new QName("http://webservice.interfaceserver.aos.cvut.cz/", "PrintingException");
    private final static QName _FindFlightResponse_QNAME = new QName("http://webservice.interfaceserver.aos.cvut.cz/", "findFlightResponse");
    private final static QName _FindFlight_QNAME = new QName("http://webservice.interfaceserver.aos.cvut.cz/", "findFlight");
    private final static QName _PrintAirTicketResponse_QNAME = new QName("http://webservice.interfaceserver.aos.cvut.cz/", "printAirTicketResponse");
    private final static QName _CancelFlight_QNAME = new QName("http://webservice.interfaceserver.aos.cvut.cz/", "cancelFlight");
    private final static QName _PrintAirTicket_QNAME = new QName("http://webservice.interfaceserver.aos.cvut.cz/", "printAirTicket");
    private final static QName _ChangeSeat_QNAME = new QName("http://webservice.interfaceserver.aos.cvut.cz/", "changeSeat");
    private final static QName _ChangeSeatResponse_QNAME = new QName("http://webservice.interfaceserver.aos.cvut.cz/", "changeSeatResponse");
    private final static QName _BookFlight_QNAME = new QName("http://webservice.interfaceserver.aos.cvut.cz/", "bookFlight");
    private final static QName _UnknownAirTicketException_QNAME = new QName("http://webservice.interfaceserver.aos.cvut.cz/", "UnknownAirTicketException");
    private final static QName _BookFlightResponse_QNAME = new QName("http://webservice.interfaceserver.aos.cvut.cz/", "bookFlightResponse");
    private final static QName _UnknownAccountException_QNAME = new QName("http://webservice.interfaceserver.aos.cvut.cz/", "UnknownAccountException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cz.cvut.aos.flyingcompany.generatedcode.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FlightCapacityExceededException }
     * 
     */
    public FlightCapacityExceededException createFlightCapacityExceededException() {
        return new FlightCapacityExceededException();
    }

    /**
     * Create an instance of {@link SeatNotAvailable }
     * 
     */
    public SeatNotAvailable createSeatNotAvailable() {
        return new SeatNotAvailable();
    }

    /**
     * Create an instance of {@link UnsupportedPaymentTypeException }
     * 
     */
    public UnsupportedPaymentTypeException createUnsupportedPaymentTypeException() {
        return new UnsupportedPaymentTypeException();
    }

    /**
     * Create an instance of {@link CancelFlightResponse }
     * 
     */
    public CancelFlightResponse createCancelFlightResponse() {
        return new CancelFlightResponse();
    }

    /**
     * Create an instance of {@link PrintingException }
     * 
     */
    public PrintingException createPrintingException() {
        return new PrintingException();
    }

    /**
     * Create an instance of {@link FindFlightResponse }
     * 
     */
    public FindFlightResponse createFindFlightResponse() {
        return new FindFlightResponse();
    }

    /**
     * Create an instance of {@link FindFlight }
     * 
     */
    public FindFlight createFindFlight() {
        return new FindFlight();
    }

    /**
     * Create an instance of {@link PrintAirTicketResponse }
     * 
     */
    public PrintAirTicketResponse createPrintAirTicketResponse() {
        return new PrintAirTicketResponse();
    }

    /**
     * Create an instance of {@link CancelFlight }
     * 
     */
    public CancelFlight createCancelFlight() {
        return new CancelFlight();
    }

    /**
     * Create an instance of {@link PrintAirTicket }
     * 
     */
    public PrintAirTicket createPrintAirTicket() {
        return new PrintAirTicket();
    }

    /**
     * Create an instance of {@link ChangeSeat }
     * 
     */
    public ChangeSeat createChangeSeat() {
        return new ChangeSeat();
    }

    /**
     * Create an instance of {@link ChangeSeatResponse }
     * 
     */
    public ChangeSeatResponse createChangeSeatResponse() {
        return new ChangeSeatResponse();
    }

    /**
     * Create an instance of {@link BookFlight }
     * 
     */
    public BookFlight createBookFlight() {
        return new BookFlight();
    }

    /**
     * Create an instance of {@link BookFlightResponse }
     * 
     */
    public BookFlightResponse createBookFlightResponse() {
        return new BookFlightResponse();
    }

    /**
     * Create an instance of {@link UnknownAirTicketException }
     * 
     */
    public UnknownAirTicketException createUnknownAirTicketException() {
        return new UnknownAirTicketException();
    }

    /**
     * Create an instance of {@link UnknownAccountException }
     * 
     */
    public UnknownAccountException createUnknownAccountException() {
        return new UnknownAccountException();
    }

    /**
     * Create an instance of {@link Flight }
     * 
     */
    public Flight createFlight() {
        return new Flight();
    }

    /**
     * Create an instance of {@link PaymentInfo }
     * 
     */
    public PaymentInfo createPaymentInfo() {
        return new PaymentInfo();
    }

    /**
     * Create an instance of {@link AirTicket }
     * 
     */
    public AirTicket createAirTicket() {
        return new AirTicket();
    }

    /**
     * Create an instance of {@link AirTicketCopy }
     * 
     */
    public AirTicketCopy createAirTicketCopy() {
        return new AirTicketCopy();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightCapacityExceededException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.interfaceserver.aos.cvut.cz/", name = "FlightCapacityExceededException")
    public JAXBElement<FlightCapacityExceededException> createFlightCapacityExceededException(FlightCapacityExceededException value) {
        return new JAXBElement<FlightCapacityExceededException>(_FlightCapacityExceededException_QNAME, FlightCapacityExceededException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeatNotAvailable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.interfaceserver.aos.cvut.cz/", name = "SeatNotAvailable")
    public JAXBElement<SeatNotAvailable> createSeatNotAvailable(SeatNotAvailable value) {
        return new JAXBElement<SeatNotAvailable>(_SeatNotAvailable_QNAME, SeatNotAvailable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsupportedPaymentTypeException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.interfaceserver.aos.cvut.cz/", name = "UnsupportedPaymentTypeException")
    public JAXBElement<UnsupportedPaymentTypeException> createUnsupportedPaymentTypeException(UnsupportedPaymentTypeException value) {
        return new JAXBElement<UnsupportedPaymentTypeException>(_UnsupportedPaymentTypeException_QNAME, UnsupportedPaymentTypeException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelFlightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.interfaceserver.aos.cvut.cz/", name = "cancelFlightResponse")
    public JAXBElement<CancelFlightResponse> createCancelFlightResponse(CancelFlightResponse value) {
        return new JAXBElement<CancelFlightResponse>(_CancelFlightResponse_QNAME, CancelFlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintingException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.interfaceserver.aos.cvut.cz/", name = "PrintingException")
    public JAXBElement<PrintingException> createPrintingException(PrintingException value) {
        return new JAXBElement<PrintingException>(_PrintingException_QNAME, PrintingException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindFlightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.interfaceserver.aos.cvut.cz/", name = "findFlightResponse")
    public JAXBElement<FindFlightResponse> createFindFlightResponse(FindFlightResponse value) {
        return new JAXBElement<FindFlightResponse>(_FindFlightResponse_QNAME, FindFlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindFlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.interfaceserver.aos.cvut.cz/", name = "findFlight")
    public JAXBElement<FindFlight> createFindFlight(FindFlight value) {
        return new JAXBElement<FindFlight>(_FindFlight_QNAME, FindFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintAirTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.interfaceserver.aos.cvut.cz/", name = "printAirTicketResponse")
    public JAXBElement<PrintAirTicketResponse> createPrintAirTicketResponse(PrintAirTicketResponse value) {
        return new JAXBElement<PrintAirTicketResponse>(_PrintAirTicketResponse_QNAME, PrintAirTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelFlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.interfaceserver.aos.cvut.cz/", name = "cancelFlight")
    public JAXBElement<CancelFlight> createCancelFlight(CancelFlight value) {
        return new JAXBElement<CancelFlight>(_CancelFlight_QNAME, CancelFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintAirTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.interfaceserver.aos.cvut.cz/", name = "printAirTicket")
    public JAXBElement<PrintAirTicket> createPrintAirTicket(PrintAirTicket value) {
        return new JAXBElement<PrintAirTicket>(_PrintAirTicket_QNAME, PrintAirTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeSeat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.interfaceserver.aos.cvut.cz/", name = "changeSeat")
    public JAXBElement<ChangeSeat> createChangeSeat(ChangeSeat value) {
        return new JAXBElement<ChangeSeat>(_ChangeSeat_QNAME, ChangeSeat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeSeatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.interfaceserver.aos.cvut.cz/", name = "changeSeatResponse")
    public JAXBElement<ChangeSeatResponse> createChangeSeatResponse(ChangeSeatResponse value) {
        return new JAXBElement<ChangeSeatResponse>(_ChangeSeatResponse_QNAME, ChangeSeatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookFlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.interfaceserver.aos.cvut.cz/", name = "bookFlight")
    public JAXBElement<BookFlight> createBookFlight(BookFlight value) {
        return new JAXBElement<BookFlight>(_BookFlight_QNAME, BookFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownAirTicketException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.interfaceserver.aos.cvut.cz/", name = "UnknownAirTicketException")
    public JAXBElement<UnknownAirTicketException> createUnknownAirTicketException(UnknownAirTicketException value) {
        return new JAXBElement<UnknownAirTicketException>(_UnknownAirTicketException_QNAME, UnknownAirTicketException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookFlightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.interfaceserver.aos.cvut.cz/", name = "bookFlightResponse")
    public JAXBElement<BookFlightResponse> createBookFlightResponse(BookFlightResponse value) {
        return new JAXBElement<BookFlightResponse>(_BookFlightResponse_QNAME, BookFlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownAccountException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.interfaceserver.aos.cvut.cz/", name = "UnknownAccountException")
    public JAXBElement<UnknownAccountException> createUnknownAccountException(UnknownAccountException value) {
        return new JAXBElement<UnknownAccountException>(_UnknownAccountException_QNAME, UnknownAccountException.class, null, value);
    }

}
