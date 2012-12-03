package cz.cvut.aos.bookingserver.webservice;

import cz.cvut.aos.bookingserver.model.AirTicket;
import cz.cvut.aos.bookingserver.model.Flight;
import cz.cvut.aos.bookingserver.service.BookingService;
import cz.cvut.aos.bookingserver.service.exception.FlightCapacityExceededException;
import cz.cvut.aos.bookingserver.service.exception.SeatNotAvailable;
import cz.cvut.aos.bookingserver.service.exception.UnknownAirTicketException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@WebService(endpointInterface = "cz.cvut.aos.bookingserver.webservice.BookingService")
@Service("bookingWebServiceImpl")
public class BookingServiceImpl implements cz.cvut.aos.bookingserver.webservice.BookingService {

    @Autowired
    BookingService bookingService;

    @Override
    public List<Flight> findFlight(String source, String target) {
        List<Flight> flights = bookingService.findFlight(source, target);
        return flights;
    }

    @Override
    public AirTicket findAirTicket(Long airTicketCode) throws UnknownAirTicketException{
        return bookingService.findAirTicket(airTicketCode);
    }
    
    @Override
    public List<Flight> findFlightWithTime(String source, String target, String flightTime) {
        return bookingService.findFlightWithTime(source, target, flightTime);
    }

    @Override
    public AirTicket bookFlight(Long code) throws FlightCapacityExceededException{
        return bookingService.bookFlight(code);
    }

    @Override
    public AirTicket changeSeat(Long airTicketCode, int seatNumber) throws SeatNotAvailable, UnknownAirTicketException {
        return bookingService.changeSeat(airTicketCode, seatNumber);
    }

    @Override
    public void cancelFlight(Long airTicketCode) throws UnknownAirTicketException {
        bookingService.cancelFlight(airTicketCode);
    }
    
    @Override
    public int getFlightCapacity(Long code) {
        return bookingService.getFlightCapacity(code);
    }

}
