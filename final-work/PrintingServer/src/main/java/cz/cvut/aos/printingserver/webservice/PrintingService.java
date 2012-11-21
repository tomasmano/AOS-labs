package cz.cvut.aos.printingserver.webservice;

import cz.cvut.aos.printingserver.model.AirTicketCopy;
import cz.cvut.aos.printingserver.model.Flight;
import cz.cvut.aos.printingserver.model.User;
import javax.jws.WebService;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@WebService
public interface PrintingService {
    
    public AirTicketCopy printAirTicket(Flight flight, User user);
    
}
