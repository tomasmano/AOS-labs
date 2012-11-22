package cz.cvut.aos.bookingserver.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.3.1
 * Thu Nov 22 17:33:26 CET 2012
 * Generated source version: 2.3.1
 * 
 */
 
@WebService(targetNamespace = "http://webservice.bookingserver.aos.cvut.cz/", name = "BookingService")
@XmlSeeAlso({ObjectFactory.class})
public interface BookingService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "findFlightWithTime", targetNamespace = "http://webservice.bookingserver.aos.cvut.cz/", className = "cz.cvut.aos.bookingserver.client.FindFlightWithTime")
    @WebMethod
    @ResponseWrapper(localName = "findFlightWithTimeResponse", targetNamespace = "http://webservice.bookingserver.aos.cvut.cz/", className = "cz.cvut.aos.bookingserver.client.FindFlightWithTimeResponse")
    public java.util.List<cz.cvut.aos.bookingserver.client.Flight> findFlightWithTime(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        javax.xml.datatype.XMLGregorianCalendar arg2
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getFlightCapacity", targetNamespace = "http://webservice.bookingserver.aos.cvut.cz/", className = "cz.cvut.aos.bookingserver.client.GetFlightCapacity")
    @WebMethod
    @ResponseWrapper(localName = "getFlightCapacityResponse", targetNamespace = "http://webservice.bookingserver.aos.cvut.cz/", className = "cz.cvut.aos.bookingserver.client.GetFlightCapacityResponse")
    public int getFlightCapacity(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Long arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "bookFlight", targetNamespace = "http://webservice.bookingserver.aos.cvut.cz/", className = "cz.cvut.aos.bookingserver.client.BookFlight")
    @WebMethod
    @ResponseWrapper(localName = "bookFlightResponse", targetNamespace = "http://webservice.bookingserver.aos.cvut.cz/", className = "cz.cvut.aos.bookingserver.client.BookFlightResponse")
    public cz.cvut.aos.bookingserver.client.AirTicket bookFlight(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Long arg0
    ) throws FlightCapacityExceededException_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "findFlight", targetNamespace = "http://webservice.bookingserver.aos.cvut.cz/", className = "cz.cvut.aos.bookingserver.client.FindFlight")
    @WebMethod
    @ResponseWrapper(localName = "findFlightResponse", targetNamespace = "http://webservice.bookingserver.aos.cvut.cz/", className = "cz.cvut.aos.bookingserver.client.FindFlightResponse")
    public java.util.List<cz.cvut.aos.bookingserver.client.Flight> findFlight(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );
}
