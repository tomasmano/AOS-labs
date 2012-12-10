package cz.cvut.aos.printingserver.service;

import cz.cvut.aos.printingserver.model.AirTicket;
import cz.cvut.aos.printingserver.model.AirTicketCopy;
import cz.cvut.aos.printingserver.model.User;
import cz.cvut.aos.printingserver.service.exception.PrintingException;

/**
 * Application service interface.
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public interface PrintingService {

    /**
     * Print air ticket electronic document for given ticket and user
     *
     * @param ticket air ticket
     * @param user user
     * @return electronic document
     * @throws PrintingException if exception occurs during printing
     */
    public AirTicketCopy printAirTicket(AirTicket ticket, User user) throws PrintingException;
}
