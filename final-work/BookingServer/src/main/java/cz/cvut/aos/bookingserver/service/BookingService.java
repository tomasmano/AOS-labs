package cz.cvut.aos.bookingserver.service;

import cz.cvut.aos.bookingserver.model.AirTicket;
import cz.cvut.aos.bookingserver.model.Flight;
import cz.cvut.aos.bookingserver.service.exception.FlightCapacityExceededException;
import cz.cvut.aos.bookingserver.service.exception.SeatNotAvailable;
import cz.cvut.aos.bookingserver.service.exception.UnknownAirTicketException;
import java.util.List;

/**
 * Application service interface.
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public interface BookingService {

    /**
     * Returns matching flights with given source and target
     *
     * @param source source destination
     * @param target target destination
     * @return matching flights
     */
    public List<Flight> findFlight(String source, String target);

    /**
     * Returns airticke for given code.
     *
     * @param airTicketCode air ticket's code
     * @return airticket
     * @throws UnknownAirTicketException if given airTickedCode doesn't match
     * any existing ticket
     */
    public AirTicket findAirTicket(Long airTicketCode) throws UnknownAirTicketException;

    /**
     * Returns matching flights with given source, target and flight's time.
     *
     * @param source source destination
     * @param target target destination
     * @param flightTime flight's time
     * @return matching flights
     */
    public List<Flight> findFlightWithTime(String source, String target, String flightTime);

    /**
     * Books flight with given code.
     *
     * @param code flight's code
     * @return airticket
     * @throws FlightCapacityExceededException if flight's capacity is exceeded
     */
    public AirTicket bookFlight(Long code) throws FlightCapacityExceededException;

    /**
     * Change seat number for given ticket's code with given seat number.
     *
     * @param airTicketCode code
     * @param seatNumber number of seat
     * @return updated airticket
     * @throws SeatNotAvailable if seat is not available
     * @throws UnknownAirTicketException if given airTickedCode doesn't match
     * any existing ticket
     */
    public AirTicket changeSeat(Long airTicketCode, int seatNumber) throws SeatNotAvailable, UnknownAirTicketException;

    /**
     * Cancel booked flight for given air ticket's code.
     *
     * @param airTicketCode air ticket's code
     * @throws UnknownAirTicketException if given airTickedCode doesn't match
     * any existing ticket
     */
    public void cancelFlight(Long airTicketCode) throws UnknownAirTicketException;

    /**
     * Returns flight's capacity for given code.
     *
     * @param code flight's code
     * @return flight's capacity
     */
    public int getFlightCapacity(Long code);
}
