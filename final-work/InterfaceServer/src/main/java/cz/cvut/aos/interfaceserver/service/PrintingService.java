package cz.cvut.aos.interfaceserver.service;

import cz.cvut.aos.interfaceserver.model.AirTicket;
import cz.cvut.aos.interfaceserver.model.AirTicketCopy;
import cz.cvut.aos.interfaceserver.model.User;
import cz.cvut.aos.interfaceserver.service.exception.PrintingException;
import javax.jws.WebService;



/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@WebService(targetNamespace="http://webservice.printingserver.aos.cvut.cz/")
public interface  PrintingService {

    public AirTicketCopy printAirTicket(AirTicket ticket, User user) throws PrintingException;
    
}
