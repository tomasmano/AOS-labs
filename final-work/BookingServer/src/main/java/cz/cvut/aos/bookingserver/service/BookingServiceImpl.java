package cz.cvut.aos.bookingserver.service;

import cz.cvut.aos.bookingserver.dao.contract.GenericDAO;
import cz.cvut.aos.bookingserver.model.AirTicket;
import cz.cvut.aos.bookingserver.model.Flight;
import cz.cvut.aos.bookingserver.service.exception.FlightCapacityExceededException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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

    @Autowired
    @Qualifier("genericHibernateJpa2DAO")
    GenericDAO genericDao;

    @Override
    public List<Flight> findFlight(String source, String target) {
        return genericDao.findByProperties(new String[]{"source", "target"}, new String[]{source, target}, Flight.class);
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
    public int getFlightCapacity(Long code) {
        Flight flight = genericDao.findById(code, Flight.class);
        return flight.getCapacity();
    }
}
