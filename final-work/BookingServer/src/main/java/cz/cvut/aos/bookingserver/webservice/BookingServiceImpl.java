package cz.cvut.aos.bookingserver.webservice;

import cz.cvut.aos.bookingserver.dao.FlightDao;
import cz.cvut.aos.bookingserver.model.AirTicket;
import cz.cvut.aos.bookingserver.model.Flight;
import cz.cvut.aos.bookingserver.service.FlightService;
import java.util.Date;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@WebService(endpointInterface = "cz.cvut.aos.bookingserver.webservice.BookingService")
public class BookingServiceImpl implements BookingService {

    @Autowired
    FlightService flightService;

    @Override
    public Flight findFlight(String source, String target) {
        return flightService.findFlight(source, target);
    }

    @Override
    public Flight findFlightWithTime(String source, String target, Date flightTime) {
        return flightService.findFlightWithTime(source, target, flightTime);
    }

    @Override
    public AirTicket bookFlight(Long code) {
        return flightService.bookFlight(code);
    }

    @Override
    public int getFlightCapacity(Long code) {
        return flightService.getFlightCapacity(code);
    }
}
