package cz.cvut.aos.bookingserver.webservice;

import cz.cvut.aos.bookingserver.model.AirTicket;
import cz.cvut.aos.bookingserver.model.Flight;
import cz.cvut.aos.bookingserver.service.exception.FlightCapacityExceededException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@WebService
public interface BookingService {

    public List<Flight> findFlight(String source, String target);

    public List<Flight> findFlightWithTime(String source, String target, String flightTime);

    public AirTicket bookFlight(Long code) throws FlightCapacityExceededException;

    public int getFlightCapacity(Long code);
}
