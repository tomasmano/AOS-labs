package cz.cvut.aos.bookingserver.persistance;

import cz.cvut.aos.bookingserver.dao.contract.GenericDAO;
import cz.cvut.aos.bookingserver.model.AirTicket;
import cz.cvut.aos.bookingserver.model.Flight;
import cz.cvut.aos.bookingserver.service.BookingService;
import cz.cvut.aos.bookingserver.service.exception.FlightCapacityExceededException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import static org.junit.Assert.*;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public class BookingServerTest extends AbstractServiceTest{
    
    @Autowired
    BookingService bookingService;
    
    @Autowired
    @Qualifier("genericHibernateJpa2DAO")
    GenericDAO genericDao;
    
    @Test
    public void test_find_flight(){
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
}
