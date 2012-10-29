package cz.cvut.aos.bookingserver.service;

import cz.cvut.aos.bookingserver.dao.AirTicketDao;
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
@Service
public class FlightServiceImpl implements FlightService {

    @Autowired FlightDao flightDao;
    @Autowired AirTicketDao airTicketDao;

    @Override
    public Flight findFlight(String source, String target) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Flight findFlightWithTime(String source, String target, Date flightTime) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public AirTicket bookFlight(Long code) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getFlightCapacity(Long code) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
