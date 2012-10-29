package cz.cvut.aos.bookingserver.service;

import cz.cvut.aos.bookingserver.dao.FlightDao;
import cz.cvut.aos.bookingserver.model.AirTicket;
import cz.cvut.aos.bookingserver.model.Flight;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public interface  FlightService {

    public Flight findFlight(String source, String target);

    public Flight findFlightWithTime(String source, String target, Date flightTime);

    public AirTicket bookFlight(Long code);

    public int getFlightCapacity(Long code);
}
