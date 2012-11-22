package cz.cvut.aos.paymentserver.webservice;

import cz.cvut.aos.paymentserver.model.AirTicketCopy;
import cz.cvut.aos.paymentserver.model.Flight;
import cz.cvut.aos.paymentserver.service.exception.FlightCapacityExceededException;
import cz.cvut.aos.paymentserver.service.exception.UnknownAccountException;
import java.util.Date;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@WebService
public interface InterfacetWebService {

    public List<Flight> findFlight(String source, String target, Date flightTime);
    
    public AirTicketCopy bookFlight(Long code) throws UnknownAccountException, FlightCapacityExceededException;
    
}
