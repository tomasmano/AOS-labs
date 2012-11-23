package cz.cvut.aos.interfaceserver.service;

import cz.cvut.aos.interfaceserver.model.AirTicketCopy;
import cz.cvut.aos.interfaceserver.model.Flight;
import cz.cvut.aos.interfaceserver.model.User;
import cz.cvut.aos.interfaceserver.service.exception.PrintingException;



/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public interface  PrintingService {

    public AirTicketCopy printAirTicket(Flight flight, User user) throws PrintingException;
    
}
