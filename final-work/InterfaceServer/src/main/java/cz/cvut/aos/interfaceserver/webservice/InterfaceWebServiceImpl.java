package cz.cvut.aos.interfaceserver.webservice;

import cz.cvut.aos.interfaceserver.model.Account;
import cz.cvut.aos.interfaceserver.model.AirTicket;
import cz.cvut.aos.interfaceserver.model.AirTicketCopy;
import cz.cvut.aos.interfaceserver.model.Flight;
import cz.cvut.aos.interfaceserver.model.Payment;
import cz.cvut.aos.interfaceserver.model.PaymentInfo;
import cz.cvut.aos.interfaceserver.model.User;
import cz.cvut.aos.interfaceserver.service.BookingService;
import cz.cvut.aos.interfaceserver.service.PaymentService;
import cz.cvut.aos.interfaceserver.service.PrintingService;
import cz.cvut.aos.interfaceserver.service.exception.FlightCapacityExceededException;
import cz.cvut.aos.interfaceserver.service.exception.PrintingException;
import cz.cvut.aos.interfaceserver.service.exception.SeatNotAvailable;
import cz.cvut.aos.interfaceserver.service.exception.UnknownAccountException;
import cz.cvut.aos.interfaceserver.service.exception.UnknownAirTicketException;
import cz.cvut.aos.interfaceserver.service.exception.UnsupportedPaymentTypeException;
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
public class InterfaceWebServiceImpl implements InterfaceWebService {

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
    public AirTicket bookFlight(Long code, PaymentInfo paymentInfo) throws UnknownAccountException, FlightCapacityExceededException, UnsupportedPaymentTypeException {
        AirTicket airTicket = bookingService.bookFlight(code);
        String type = paymentInfo.getType();
        if (type.equals("bank")) {
            paymentService.payWithBankAccount(paymentInfo.getPayer(), paymentInfo.getPayer(), airTicket.getFlight().getPrice());
        } else if (type.equals("credit")) {
            paymentService.payWithCreditCard(paymentInfo.getPayer(), paymentInfo.getPayer(), airTicket.getFlight().getPrice());
        } else {
            throw new UnsupportedPaymentTypeException("Payment type ["+type+"] is not supported");
        }
//        return printingService.printAirTicket(airTicket, new User(payerAccount.getName(), payerAccount.getName()));
        return airTicket;
    }

    @Override
    public AirTicketCopy printAirTicket(Long identifier, Long payer) throws PrintingException, UnknownAirTicketException, UnknownAccountException {
        AirTicket ticket = bookingService.findAirTicket(identifier);
        Account payerAccount = paymentService.getAccountDetails(payer);
        return printingService.printAirTicket(ticket, new User(payerAccount.getName(), payerAccount.getName()));
    }

    @Override
    public AirTicket changeSeat(Long identifier, int seatNumber) throws SeatNotAvailable, UnknownAirTicketException {
        return bookingService.changeSeat(identifier, seatNumber);
    }

    @Override
    public void cancelFlight(Long identifier) throws UnknownAirTicketException {
        bookingService.cancelFlight(identifier);
    }
}
