package cz.cvut.aos.bookingserver.client.provider;

import cz.cvut.aos.bookingserver.client.AirTicket;
import cz.cvut.aos.bookingserver.client.BookingService;
import cz.cvut.aos.bookingserver.client.BookingServiceImplService;
import cz.cvut.aos.bookingserver.client.Flight;
import cz.cvut.aos.bookingserver.client.FlightCapacityExceededException_Exception;
import java.net.URL;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public class BookingServiceProvider {

    private static final QName SERVICE_NAME = new QName("http://webservice.bookingserver.aos.cvut.cz/", "BookingServiceImplService");
    private final BookingService port;

    public BookingServiceProvider() {
        URL wsdlURL = BookingServiceImplService.WSDL_LOCATION;
        BookingServiceImplService ss = new BookingServiceImplService(wsdlURL, SERVICE_NAME);
        port = ss.getBookingServiceImplPort();
    }

    public List<Flight> findFlight(String source, String target, Date date) {
        XMLGregorianCalendar xmlDate = convertDateToXMLGregorianCalendar(date);
        return port.findFlightWithTime(source, target, xmlDate);
    }
    
    public AirTicket bookFlight(Long code) throws FlightCapacityExceededException_Exception{
        return port.bookFlight(code);
    }

    private XMLGregorianCalendar convertDateToXMLGregorianCalendar(Date date) {
        GregorianCalendar gregory = new GregorianCalendar();
        gregory.setTime(date);
        XMLGregorianCalendar convertedDate = null;
        try {
            convertedDate = DatatypeFactory.newInstance()
                    .newXMLGregorianCalendar(gregory);
        } catch (DatatypeConfigurationException ex) {
            ex.printStackTrace(System.out);
        }
        return convertedDate;
    }
}
