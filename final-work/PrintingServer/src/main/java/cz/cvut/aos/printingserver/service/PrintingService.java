package cz.cvut.aos.printingserver.service;

import cz.cvut.aos.printingserver.model.AirTicketCopy;
import cz.cvut.aos.printingserver.model.Flight;
import cz.cvut.aos.printingserver.model.User;
import cz.cvut.aos.printingserver.service.exception.PrintingException;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public interface  PrintingService {

    public AirTicketCopy printAirTicket(Flight flight, User user) throws PrintingException;
    
}
