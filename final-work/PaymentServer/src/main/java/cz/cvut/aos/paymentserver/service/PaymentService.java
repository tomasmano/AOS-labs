package cz.cvut.aos.paymentserver.service;

import cz.cvut.aos.paymentserver.model.AirTicket;
import cz.cvut.aos.paymentserver.model.Flight;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public interface  PaymentService {

    public List<Flight> findFlight(String source, String target);

    public List<Flight> findFlightWithTime(String source, String target, Date flightTime);

    public AirTicket bookFlight(Long code);

    public int getFlightCapacity(Long code);
}
