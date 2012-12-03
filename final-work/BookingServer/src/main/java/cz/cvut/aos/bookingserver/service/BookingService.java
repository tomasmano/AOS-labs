package cz.cvut.aos.bookingserver.service;

import cz.cvut.aos.bookingserver.model.AirTicket;
import cz.cvut.aos.bookingserver.model.Flight;
import cz.cvut.aos.bookingserver.service.exception.FlightCapacityExceededException;
import cz.cvut.aos.bookingserver.service.exception.SeatNotAvailable;
import cz.cvut.aos.bookingserver.service.exception.UnknownAirTicketException;
import java.util.List;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public interface BookingService {

    public List<Flight> findFlight(String source, String target);

    public AirTicket findAirTicket(Long airTicketCode) throws UnknownAirTicketException;

    public List<Flight> findFlightWithTime(String source, String target, String flightTime);

    public AirTicket bookFlight(Long code) throws FlightCapacityExceededException;

    public AirTicket changeSeat(Long airTicketCode, int seatNumber) throws SeatNotAvailable, UnknownAirTicketException;

    public void cancelFlight(Long airTicketCode) throws UnknownAirTicketException;

    public int getFlightCapacity(Long code);
}
