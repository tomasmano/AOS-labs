package cz.cvut.aos.bookingserver.dao;

import cz.cvut.aos.bookingserver.model.AirTicket;
import cz.cvut.aos.bookingserver.model.Flight;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@Repository
@Transactional
public class FlightDao {

    @PersistenceContext
    private EntityManager em;

    public void save(Flight flight) {
        em.persist(flight);
    }
    
    public void getCapacity(Flight flight){
        //TODO
    }

    @SuppressWarnings("unchecked")
    public List<Flight> list() {
        return em.createQuery("select f from Flight f").getResultList();
    }
}
