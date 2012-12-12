package cz.cvut.aos.interfaceserver.webservice;

import cz.cvut.aos.interfaceserver.service.exception.UnsupportedPaymentTypeException;
import cz.cvut.aos.interfaceserver.service.exception.UnknownAirTicketException;
import cz.cvut.aos.interfaceserver.model.AirTicket;
import cz.cvut.aos.interfaceserver.service.exception.UnknownFlightException;
import cz.cvut.aos.interfaceserver.service.exception.SeatNotAvailable;
import cz.cvut.aos.interfaceserver.model.AirTicketCopy;
import cz.cvut.aos.interfaceserver.model.Flight;
import cz.cvut.aos.interfaceserver.model.PaymentInfo;
import cz.cvut.aos.interfaceserver.service.exception.FlightCapacityExceededException;
import cz.cvut.aos.interfaceserver.service.exception.PrintingException;
import cz.cvut.aos.interfaceserver.service.exception.UnknownAccountException;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@WebService
public interface InterfaceWebService {

    /**
     * Finds matching flights for given source, target and flight's time.
     *
     * @param source source destination
     * @param target target destination
     * @param flightTime given flight's time
     * @return list of matching flights
     */
    public List<Flight> findFlight(String source, String target, String flightTime);

    /**
     * Books flight by flight's code and makes payment from given payer to given
     * payee.
     *
     * @param code flight's code
     * @param paymentInfo contains payment info (payer, payee, amount, type)
     * @return air ticket
     * @throws UnknownAccountException when unknown account is part of
     * transaction
     * @throws FlightCapacityExceededException when capacity is over limit
     * @throws PrintingException when cannot print ticket
     */
    public AirTicket bookFlight(Long code, PaymentInfo paymentInfo) throws UnknownAccountException, FlightCapacityExceededException, UnsupportedPaymentTypeException;
    
    /**
     * Print air ticket electronic document for given airticket's identifier.
     * 
     * @param identifier airticket's identifier
     * @return air ticket as the electronic document
     * @throws PrintingException when cannot print ticket
     * @throws UnknownFlightException when flight code is not found
     */
    public AirTicketCopy printAirTicket(Long identifier, Long payer) throws PrintingException, UnknownAirTicketException, UnknownAccountException;

    /**
     * Change seat for given flight
     *
     * @param identifier airticket's identifier
     * @param seatNumber seat number
     * @return air ticket
     * @throws SeatNotAvailable when given seat is not available
     * @throws UnknownFlightException when given flight code is not found
     */
    public AirTicket changeSeat(Long identifier, int seatNumber) throws SeatNotAvailable, UnknownAirTicketException;

    /**
     * Cancel flight for given flight.
     *
     * @param identifier airticket's identifier
     * @throws UnknownFlightException when given flight code is not found
     */
    public void cancelFlight(Long identifier) throws UnknownAirTicketException;
}
