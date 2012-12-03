package cz.cvut.aos.interfaceserver.persistance;

import cz.cvut.aos.interfaceserver.model.AirTicket;
import cz.cvut.aos.interfaceserver.model.AirTicketCopy;
import cz.cvut.aos.interfaceserver.model.Flight;
import cz.cvut.aos.interfaceserver.model.PaymentInfo;
import cz.cvut.aos.interfaceserver.service.BookingService;
import cz.cvut.aos.interfaceserver.service.PaymentService;
import cz.cvut.aos.interfaceserver.service.PrintingService;
import cz.cvut.aos.interfaceserver.service.exception.FlightCapacityExceededException;
import cz.cvut.aos.interfaceserver.service.exception.PrintingException;
import cz.cvut.aos.interfaceserver.service.exception.SeatNotAvailable;
import cz.cvut.aos.interfaceserver.service.exception.UnknownAccountException;
import cz.cvut.aos.interfaceserver.service.exception.UnknownAirTicketException;
import cz.cvut.aos.interfaceserver.service.exception.UnsupportedPaymentTypeException;
import cz.cvut.aos.interfaceserver.webservice.InterfacetWebService;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import javax.activation.DataHandler;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import static org.junit.Assert.*;

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
    
    @Autowired
    @Qualifier("printingServiceClient")
    PrintingService printingService;
    
    @Autowired
    @Qualifier("paymentServiceClient")
    PaymentService paymentService;

    @Ignore
    @Test
    public void test_booking_service_in_interface_server() throws FlightCapacityExceededException, ParseException {

        List<Flight> flights = bookingService.findFlight("prague", "london");
        List<Flight> flights2 = bookingService.findFlightWithTime("prague", "berlin", "2012-12-20 12:00:00");
        AirTicket airTicket = bookingService.bookFlight(1L);
        bookingService.getFlightCapacity(1L);
    }

    @Test
    public void test_booking_flight() throws UnknownAccountException, FlightCapacityExceededException, PrintingException, UnknownAirTicketException, UnsupportedPaymentTypeException {
        PaymentInfo paymentInfo = new PaymentInfo(123L, 456L, "bank");
        AirTicket airTicket = interfacetWebService.bookFlight(1L, paymentInfo);
        AirTicket retrieved = bookingService.findAirTicket(airTicket.getId());
        assertEquals(retrieved.getFlight().getId(), airTicket.getFlight().getId());
    }

    @Test(expected=UnknownAirTicketException.class)
    public void test_cancel_flight() throws UnknownAccountException, FlightCapacityExceededException, PrintingException, UnknownAirTicketException, UnsupportedPaymentTypeException {
        //given
        PaymentInfo paymentInfo = new PaymentInfo(123L, 456L, "bank");
        AirTicket airTicket = interfacetWebService.bookFlight(1L, paymentInfo);
        interfacetWebService.cancelFlight(airTicket.getId());
        //when
        AirTicket retrieved = bookingService.findAirTicket(airTicket.getId());
    }

//    @Ignore // method is useful when you want to check the printed file in your filesystem, we are not asserting anything
    @Test
    public void test_printing_flight() throws UnknownAccountException, FlightCapacityExceededException, PrintingException, UnknownAirTicketException, SeatNotAvailable, UnsupportedPaymentTypeException {
        PaymentInfo paymentInfo = new PaymentInfo(123L, 456L, "bank");
        AirTicket airTicket = interfacetWebService.bookFlight(1L, paymentInfo);
//        AirTicket airTicket = interfacetWebService.changeSeat(144L, 39);
        AirTicketCopy airTicketCopy = interfacetWebService.printAirTicket(airTicket.getId(), 123L);
        DataHandler file = airTicketCopy.getAirTicketData();
        try {
            File f = new File("newticket3.txt");
            f.createNewFile();
            FileOutputStream out = new FileOutputStream(f);
            file.writeTo(out);
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
