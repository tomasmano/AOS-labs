package cz.cvut.aos.interfaceserver.persistance;

import cz.cvut.aos.interfaceserver.model.AirTicket;
import cz.cvut.aos.interfaceserver.model.AirTicketCopy;
import cz.cvut.aos.interfaceserver.model.Flight;
import cz.cvut.aos.interfaceserver.service.BookingService;
import cz.cvut.aos.interfaceserver.service.exception.FlightCapacityExceededException;
import cz.cvut.aos.interfaceserver.service.exception.PrintingException;
import cz.cvut.aos.interfaceserver.service.exception.UnknownAccountException;
import cz.cvut.aos.interfaceserver.webservice.InterfacetWebService;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import javax.activation.DataHandler;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public class InterfaceServerTest extends AbstractServiceTest {

    @Autowired
    @Qualifier("bookingServiceClient")
    BookingService bookingService;
    @Autowired
    @Qualifier("interfaceWebServiceBean")
    InterfacetWebService interfacetWebService;

    @Ignore
    @Test
    public void test_booking_service_in_interface_server() throws FlightCapacityExceededException, ParseException {

        List<Flight> flights = bookingService.findFlight("prague", "london");
        List<Flight> flights2 = bookingService.findFlightWithTime("prague", "berlin", "2012-12-20 12:00:00");
        AirTicket airTicket = bookingService.bookFlight(1L);
        bookingService.getFlightCapacity(1L);
    }

    @Ignore
    @Test
    public void test_booking_flight() throws UnknownAccountException, FlightCapacityExceededException, PrintingException {
        AirTicketCopy airTicketCopy = interfacetWebService.bookFlight(1L, 123L, 456L);
        DataHandler file = airTicketCopy.getAirTicketData();
        try {
            FileOutputStream out = new FileOutputStream("newticket.txt");
            file.writeTo(out);
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
