package cz.cvut.aos.interfaceserver.webservice;

import cz.cvut.aos.interfaceserver.model.Account;
import cz.cvut.aos.interfaceserver.model.AirTicket;
import cz.cvut.aos.interfaceserver.model.AirTicketCopy;
import cz.cvut.aos.interfaceserver.model.Flight;
import cz.cvut.aos.interfaceserver.model.User;
import cz.cvut.aos.interfaceserver.service.BookingService;
import cz.cvut.aos.interfaceserver.service.PaymentService;
import cz.cvut.aos.interfaceserver.service.PrintingService;
import cz.cvut.aos.interfaceserver.service.exception.FlightCapacityExceededException;
import cz.cvut.aos.interfaceserver.service.exception.PrintingException;
import cz.cvut.aos.interfaceserver.service.exception.UnknownAccountException;
import java.util.List;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@Service("interfaceWebServiceBean")
@WebService(endpointInterface = "cz.cvut.aos.interfaceserver.webservice.InterfaceWebService")
public class InterfaceWebServiceImpl implements InterfacetWebService {

    @Autowired
    @Qualifier("bookingServiceClient")
    BookingService bookingService;
    
    @Autowired
    @Qualifier("printingServiceClient")
    PrintingService printingService;
    
    @Autowired
    @Qualifier("paymentServiceClient")
    PaymentService paymentService;

    @Override
    public List<Flight> findFlight(String source, String target, String flightTime) {
        return bookingService.findFlightWithTime(source, target, flightTime);
    }

    @Override
    public AirTicketCopy bookFlight(Long code, Long payer, Long payee) throws UnknownAccountException, FlightCapacityExceededException, PrintingException {
        Account payerAccount = paymentService.getAccountDetails(payer);
        AirTicket airTicket = bookingService.bookFlight(code);
        paymentService.payWithBankAccount(payer, payee, airTicket.getFlight().getPrice());
        return printingService.printAirTicket(airTicket, new User(payerAccount.getName(), payerAccount.getName()));
    }
}
