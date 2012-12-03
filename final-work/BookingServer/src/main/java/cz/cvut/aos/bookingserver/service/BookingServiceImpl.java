package cz.cvut.aos.bookingserver.service;

import cz.cvut.aos.bookingserver.dao.contract.GenericDAO;
import cz.cvut.aos.bookingserver.model.AirTicket;
import cz.cvut.aos.bookingserver.model.Flight;
import cz.cvut.aos.bookingserver.service.exception.FlightCapacityExceededException;
import cz.cvut.aos.bookingserver.service.exception.SeatNotAvailable;
import cz.cvut.aos.bookingserver.service.exception.UnknownAirTicketException;
import cz.cvut.aos.bookingserver.service.exception.UnknownFlightException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@Service
@Transactional
public class BookingServiceImpl implements BookingService {

    private static final Logger LOG = LoggerFactory.getLogger(BookingServiceImpl.class);
    
    @Autowired
    @Qualifier("genericHibernateJpa2DAO")
    GenericDAO genericDao;

    @Override
    public List<Flight> findFlight(String source, String target) {
        return genericDao.findByProperties(new String[]{"source", "target"}, new String[]{source, target}, Flight.class);
    }

    @Override
    public AirTicket findAirTicket(Long airTicketCode) throws UnknownAirTicketException{
        AirTicket retrieved =  genericDao.findById(airTicketCode, AirTicket.class);
        if (retrieved==null) {
            throw new UnknownAirTicketException("Cannot find air ticket with id ["+airTicketCode+"]");
        }
        return retrieved;
    }

    @Override
    public List<Flight> findFlightWithTime(String source, String target, String flightTime) {
        Timestamp timestamp = Timestamp.valueOf(flightTime);
        List<Flight> retrieved = findFlight(source, target);
        List<Flight> flights = new ArrayList<Flight>();
        for (Flight flight : retrieved) {
            if (flight.getFlightTime().equals(timestamp)) {
                flights.add(flight);
            }
        }
        return flights;
    }

    @Override
    public AirTicket bookFlight(Long code) throws FlightCapacityExceededException {
        Flight flight = genericDao.findById(code, Flight.class);
        if (flight.getCapacity() <= 0) {
            throw new FlightCapacityExceededException("Not enough capacity avaible in given flight.");
        }
        Random r = new Random();
        int seatNumber = r.nextInt(flight.getCapacity());
        AirTicket airTicket = new AirTicket(seatNumber);
        airTicket.setFlight(flight);
        genericDao.save(airTicket);
        return airTicket;
    }

    @Override
    public AirTicket changeSeat(Long airTicketCode, int seatNumber) throws SeatNotAvailable, UnknownAirTicketException {
        AirTicket ticket = genericDao.findById(airTicketCode, AirTicket.class);
        if (ticket==null) {
            throw new UnknownAirTicketException("Cannot find air ticket with id ["+airTicketCode+"]");
        }
        int oldSeat = ticket.getSeatNumber();
        Flight flight = ticket.getFlight();
        List<AirTicket> tickets = flight.getAirTickets();
        if (!isSeatAvailable(seatNumber, tickets)) {
            throw new SeatNotAvailable("Seat is not available for this flight.");
        }
        ticket.setSeatNumber(seatNumber);
        genericDao.merge(ticket);
        LOG.info("Changing seat number [{}] for ticket with new seat number {}", oldSeat, airTicketCode);
        return ticket;
    }

    @Override
    public void cancelFlight(Long airTicketCode) throws UnknownAirTicketException {
        AirTicket ticket = genericDao.findById(airTicketCode, AirTicket.class);
        if (ticket==null) {
            throw new UnknownAirTicketException("Cannot find air ticket with id ["+airTicketCode+"]");
        }
        genericDao.delete(airTicketCode, AirTicket.class);
    }

    @Override
    public int getFlightCapacity(Long code) {
        Flight flight = genericDao.findById(code, Flight.class);
        return flight.getCapacity();
    }

    private boolean isSeatAvailable(int seat, List<AirTicket> tickets) {
        for (AirTicket airTicket : tickets) {
            if (airTicket.getSeatNumber()==seat) {
                return false;
            }
        }
        return true;
    }
}
