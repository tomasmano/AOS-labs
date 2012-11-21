package cz.cvut.aos.paymentserver.service;

import cz.cvut.aos.paymentserver.dao.contract.GenericDAO;
import cz.cvut.aos.paymentserver.model.AirTicket;
import cz.cvut.aos.paymentserver.model.Flight;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    @Qualifier("genericHibernateJpa2DAO")
    GenericDAO genericDao;

    @Override
    public List<Flight> findFlight(String source, String target) {
        return genericDao.findByProperties(new String[]{"source","target"}, new String[]{source,target}, Flight.class);
    }

    @Override
    public List<Flight> findFlightWithTime(String source, String target, Date flightTime) {
        List<Flight> retrieved = findFlight(source, target);
        List<Flight> flights = new ArrayList<Flight>();
        for (Flight flight : retrieved) {
            if (flight.getFlightTime().equals(flightTime)) {
                flights.add(flight);
            }
        }
        return flights;
    }

    @Override
    public AirTicket bookFlight(Long code) {
        Flight flight = genericDao.findById(code, Flight.class);
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
