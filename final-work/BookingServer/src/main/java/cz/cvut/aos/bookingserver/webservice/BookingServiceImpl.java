package cz.cvut.aos.bookingserver.webservice;

import cz.cvut.aos.bookingserver.model.AirTicket;
import cz.cvut.aos.bookingserver.model.Flight;
import cz.cvut.aos.bookingserver.service.BookingService;
import cz.cvut.aos.bookingserver.service.exception.FlightCapacityExceededException;
import java.util.Date;
import java.util.List;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@WebService(endpointInterface = "cz.cvut.aos.bookingserver.webservice.BookingService")
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingService bookingService;

    @Override
    public List<Flight> findFlight(String source, String target) {
        return bookingService.findFlight(source, target);
    }

    @Override
    public List<Flight> findFlightWithTime(String source, String target, Date flightTime) {
        return bookingService.findFlightWithTime(source, target, flightTime);
    }

    @Override
    public AirTicket bookFlight(Long code) throws FlightCapacityExceededException{
        return bookingService.bookFlight(code);
    }

    @Override
    public int getFlightCapacity(Long code) {
        return bookingService.getFlightCapacity(code);
    }
}
