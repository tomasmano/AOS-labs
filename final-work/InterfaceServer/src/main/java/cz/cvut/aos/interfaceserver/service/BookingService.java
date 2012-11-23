package cz.cvut.aos.interfaceserver.service;

import cz.cvut.aos.interfaceserver.model.AirTicket;
import cz.cvut.aos.interfaceserver.model.Flight;
import cz.cvut.aos.interfaceserver.service.exception.FlightCapacityExceededException;
import java.util.Date;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@WebService(targetNamespace="http://webservice.bookingserver.aos.cvut.cz/")
public interface BookingService {

    public List<Flight> findFlight(String source, String target);

    public List<Flight> findFlightWithTime(String source, String target, String flightTime);

    public AirTicket bookFlight(Long code) throws FlightCapacityExceededException;

    public int getFlightCapacity(Long code);
    
    public void test();
}
