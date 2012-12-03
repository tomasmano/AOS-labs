package cz.cvut.aos.bookingserver.persistance;

import cz.cvut.aos.bookingserver.dao.contract.GenericDAO;
import cz.cvut.aos.bookingserver.model.AirTicket;
import cz.cvut.aos.bookingserver.model.Flight;
import cz.cvut.aos.bookingserver.service.BookingService;
import cz.cvut.aos.bookingserver.service.exception.FlightCapacityExceededException;
import cz.cvut.aos.bookingserver.service.exception.SeatNotAvailable;
import cz.cvut.aos.bookingserver.service.exception.UnknownAirTicketException;
import cz.cvut.aos.bookingserver.service.exception.UnknownFlightException;
import java.sql.Timestamp;
import java.util.List;
import java.util.Random;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import static org.junit.Assert.*;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public class BookingServerTest extends AbstractServiceTest {

    @Autowired
    BookingService bookingService;
    
    @Autowired
    @Qualifier("genericHibernateJpa2DAO")
    GenericDAO genericDao;

    @Test
    public void test_find_flight() {
        //given
        Timestamp date = Timestamp.valueOf("2012-12-20 16:00:00");

        Flight flight1 = new Flight(date, 200, "praha", "london", 300);
        Flight flight2 = new Flight(date, 150, "praha", "berlin", 350);
        Flight flight3 = new Flight(date, 250, "praha", "paris", 350);
        Flight flight4 = new Flight(date, 700, "london", "tokyo", 250);
        Flight flight5 = new Flight(date, 600, "london", "rio", 300);

        genericDao.save(flight1);
        genericDao.save(flight2);
        genericDao.save(flight3);
        genericDao.save(flight4);
        genericDao.save(flight5);

        //when
        List<Flight> retrived = bookingService.findFlight("praha", "paris");
        List<Flight> empty = bookingService.findFlight("praha", "jupiter");
        List<Flight> withtime = bookingService.findFlightWithTime("london", "rio", "2012-12-20 16:00:00");

        //then
        assertFalse(retrived.isEmpty());
        assertEquals(flight3, retrived.get(0));
        assertTrue(empty.isEmpty());
        assertFalse(withtime.isEmpty());
        assertEquals(flight5, withtime.get(0));
    }

    @Test
    public void test_book_flight() throws FlightCapacityExceededException {
        //given
        Timestamp date = Timestamp.valueOf("2012-12-20 16:00:00");

        Flight flight1 = new Flight(date, 200, "praha", "london", 300);

        genericDao.save(flight1);

        //when
        AirTicket airTicket1 = bookingService.bookFlight(flight1.getId());
        Flight retrieved = airTicket1.getFlight();

        //then
        assertEquals(flight1, retrieved);
        assertEquals(299, retrieved.getCapacity());

    }

    @Test
    public void test_cancell_flight() throws FlightCapacityExceededException, UnknownAirTicketException {
        //given
        Timestamp date = Timestamp.valueOf("2012-12-20 16:00:00");
        Flight flight1 = new Flight(date, 200, "praha", "london", 300);
        genericDao.save(flight1);
        int fullCapacity = flight1.getCapacity();
        AirTicket airTicket1 = bookingService.bookFlight(flight1.getId());
        int afterCapacity1 = flight1.getCapacity();
        assertEquals(fullCapacity, afterCapacity1 + 1);

        //when
        bookingService.cancelFlight(airTicket1.getId());
        int afterCapacity2 = flight1.getCapacity();

        //then
        assertEquals(fullCapacity, afterCapacity2);
        assertTrue("Flight's airtickets should be empty after deleting the airticket", flight1.getAirTickets().isEmpty());
    }

    @Test(expected = UnknownAirTicketException.class)
    public void test_unknown_flight_exception_with_cancel() throws UnknownAirTicketException {
        //when
        bookingService.cancelFlight(898989898L);
    }

    @Test
    public void test_change_ticket() throws FlightCapacityExceededException, SeatNotAvailable, UnknownAirTicketException {
        //given
        Timestamp date = Timestamp.valueOf("2012-12-20 16:00:00");
        Flight flight1 = new Flight(date, 200, "praha", "london", 300);
        genericDao.save(flight1);
        int initialCapacity = flight1.getCapacity();
        AirTicket airTicket1 = bookingService.bookFlight(flight1.getId());
        Random r = new Random();
        int seatNumber = r.nextInt(flight1.getCapacity());
        while (seatNumber == airTicket1.getSeatNumber()) {
            seatNumber = r.nextInt(flight1.getCapacity());
        }
        //when
        AirTicket retrieved = bookingService.changeSeat(airTicket1.getId(), seatNumber);
        
        //then
        System.out.println(">>>"+retrieved.getSeatNumber()+" "+airTicket1.getSeatNumber());
        assertNotSame(retrieved.getSeatNumber(), airTicket1.getSeatNumber());
        assertEquals(airTicket1.getFlight(), retrieved.getFlight());
        assertEquals(flight1.getCapacity() + 1, initialCapacity);
    }

    @Test(expected = SeatNotAvailable.class)
    public void test_seat_not_available_exception() throws FlightCapacityExceededException, SeatNotAvailable, UnknownAirTicketException {
        //given
        Timestamp date = Timestamp.valueOf("2012-12-20 16:00:00");
        Flight flight1 = new Flight(date, 200, "praha", "london", 300);
        genericDao.save(flight1);
        AirTicket airTicket1 = bookingService.bookFlight(flight1.getId());
        
        //when 
        bookingService.changeSeat(airTicket1.getId(), airTicket1.getSeatNumber());
    }
}
