package cz.cvut.aos.printingserver.webservice;

import cz.cvut.aos.printingserver.model.AirTicket;
import cz.cvut.aos.printingserver.model.AirTicketCopy;
import cz.cvut.aos.printingserver.model.User;
import cz.cvut.aos.printingserver.service.PrintingService;
import cz.cvut.aos.printingserver.service.exception.PrintingException;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@Service("printingWebService")
@WebService(endpointInterface = "cz.cvut.aos.printingserver.webservice.PrintingService")
public class PrintingServiceImpl implements cz.cvut.aos.printingserver.webservice.PrintingService {

    @Autowired
    @Qualifier("printingServiceBean")
    PrintingService printingService;

    @Override
    public AirTicketCopy printAirTicket(AirTicket ticket, User user) throws PrintingException{
        return printingService.printAirTicket(ticket, user);
    }
}
