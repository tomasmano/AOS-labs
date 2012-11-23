package cz.cvut.aos.interfaceserver.webservice;

import cz.cvut.aos.interfaceserver.model.Account;
import cz.cvut.aos.interfaceserver.model.AirTicketCopy;
import cz.cvut.aos.interfaceserver.model.Flight;
import cz.cvut.aos.interfaceserver.service.exception.FlightCapacityExceededException;
import cz.cvut.aos.interfaceserver.service.exception.PrintingException;
import cz.cvut.aos.interfaceserver.service.exception.UnknownAccountException;
import java.util.Date;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@WebService
public interface InterfacetWebService {

    public List<Flight> findFlight(String source, String target, String flightTime);
    
    public AirTicketCopy bookFlight(Long code, Long payer, Long payee) throws UnknownAccountException, FlightCapacityExceededException, PrintingException;
    
}
