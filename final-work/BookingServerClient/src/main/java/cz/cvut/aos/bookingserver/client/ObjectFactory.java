
package cz.cvut.aos.bookingserver.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cz.cvut.aos.bookingserver.client package. 
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

    private final static QName _FindFlightResponse_QNAME = new QName("http://webservice.bookingserver.aos.cvut.cz/", "findFlightResponse");
    private final static QName _BookFlightResponse_QNAME = new QName("http://webservice.bookingserver.aos.cvut.cz/", "bookFlightResponse");
    private final static QName _FindFlight_QNAME = new QName("http://webservice.bookingserver.aos.cvut.cz/", "findFlight");
    private final static QName _GetFlightCapacity_QNAME = new QName("http://webservice.bookingserver.aos.cvut.cz/", "getFlightCapacity");
    private final static QName _FlightCapacityExceededException_QNAME = new QName("http://webservice.bookingserver.aos.cvut.cz/", "FlightCapacityExceededException");
    private final static QName _FindFlightWithTime_QNAME = new QName("http://webservice.bookingserver.aos.cvut.cz/", "findFlightWithTime");
    private final static QName _FindFlightWithTimeResponse_QNAME = new QName("http://webservice.bookingserver.aos.cvut.cz/", "findFlightWithTimeResponse");
    private final static QName _GetFlightCapacityResponse_QNAME = new QName("http://webservice.bookingserver.aos.cvut.cz/", "getFlightCapacityResponse");
    private final static QName _BookFlight_QNAME = new QName("http://webservice.bookingserver.aos.cvut.cz/", "bookFlight");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cz.cvut.aos.bookingserver.client
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
     * Create an instance of {@link FindFlightWithTime }
     * 
     */
    public FindFlightWithTime createFindFlightWithTime() {
        return new FindFlightWithTime();
    }

    /**
     * Create an instance of {@link GetFlightCapacityResponse }
     * 
     */
    public GetFlightCapacityResponse createGetFlightCapacityResponse() {
        return new GetFlightCapacityResponse();
    }

    /**
     * Create an instance of {@link FindFlightWithTimeResponse }
     * 
     */
    public FindFlightWithTimeResponse createFindFlightWithTimeResponse() {
        return new FindFlightWithTimeResponse();
    }

    /**
     * Create an instance of {@link BookFlight }
     * 
     */
    public BookFlight createBookFlight() {
        return new BookFlight();
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
     * Create an instance of {@link BookFlightResponse }
     * 
     */
    public BookFlightResponse createBookFlightResponse() {
        return new BookFlightResponse();
    }

    /**
     * Create an instance of {@link GetFlightCapacity }
     * 
     */
    public GetFlightCapacity createGetFlightCapacity() {
        return new GetFlightCapacity();
    }

    /**
     * Create an instance of {@link Flight }
     * 
     */
    public Flight createFlight() {
        return new Flight();
    }

    /**
     * Create an instance of {@link AirTicket }
     * 
     */
    public AirTicket createAirTicket() {
        return new AirTicket();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindFlightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.bookingserver.aos.cvut.cz/", name = "findFlightResponse")
    public JAXBElement<FindFlightResponse> createFindFlightResponse(FindFlightResponse value) {
        return new JAXBElement<FindFlightResponse>(_FindFlightResponse_QNAME, FindFlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookFlightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.bookingserver.aos.cvut.cz/", name = "bookFlightResponse")
    public JAXBElement<BookFlightResponse> createBookFlightResponse(BookFlightResponse value) {
        return new JAXBElement<BookFlightResponse>(_BookFlightResponse_QNAME, BookFlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindFlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.bookingserver.aos.cvut.cz/", name = "findFlight")
    public JAXBElement<FindFlight> createFindFlight(FindFlight value) {
        return new JAXBElement<FindFlight>(_FindFlight_QNAME, FindFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightCapacity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.bookingserver.aos.cvut.cz/", name = "getFlightCapacity")
    public JAXBElement<GetFlightCapacity> createGetFlightCapacity(GetFlightCapacity value) {
        return new JAXBElement<GetFlightCapacity>(_GetFlightCapacity_QNAME, GetFlightCapacity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightCapacityExceededException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.bookingserver.aos.cvut.cz/", name = "FlightCapacityExceededException")
    public JAXBElement<FlightCapacityExceededException> createFlightCapacityExceededException(FlightCapacityExceededException value) {
        return new JAXBElement<FlightCapacityExceededException>(_FlightCapacityExceededException_QNAME, FlightCapacityExceededException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindFlightWithTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.bookingserver.aos.cvut.cz/", name = "findFlightWithTime")
    public JAXBElement<FindFlightWithTime> createFindFlightWithTime(FindFlightWithTime value) {
        return new JAXBElement<FindFlightWithTime>(_FindFlightWithTime_QNAME, FindFlightWithTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindFlightWithTimeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.bookingserver.aos.cvut.cz/", name = "findFlightWithTimeResponse")
    public JAXBElement<FindFlightWithTimeResponse> createFindFlightWithTimeResponse(FindFlightWithTimeResponse value) {
        return new JAXBElement<FindFlightWithTimeResponse>(_FindFlightWithTimeResponse_QNAME, FindFlightWithTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightCapacityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.bookingserver.aos.cvut.cz/", name = "getFlightCapacityResponse")
    public JAXBElement<GetFlightCapacityResponse> createGetFlightCapacityResponse(GetFlightCapacityResponse value) {
        return new JAXBElement<GetFlightCapacityResponse>(_GetFlightCapacityResponse_QNAME, GetFlightCapacityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookFlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.bookingserver.aos.cvut.cz/", name = "bookFlight")
    public JAXBElement<BookFlight> createBookFlight(BookFlight value) {
        return new JAXBElement<BookFlight>(_BookFlight_QNAME, BookFlight.class, null, value);
    }

}
