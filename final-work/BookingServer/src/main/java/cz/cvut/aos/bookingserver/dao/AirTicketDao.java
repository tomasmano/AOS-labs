package cz.cvut.aos.bookingserver.dao;

import cz.cvut.aos.bookingserver.model.AirTicket;
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
public class AirTicketDao {

    @PersistenceContext
    private EntityManager em;

    public void save(AirTicket ticket) {
        em.persist(ticket);
    }
    
    public void delete(AirTicket ticket){
        
    }

    @SuppressWarnings("unchecked")
    public List<AirTicket> list() {
        return em.createQuery("select t from AirTicket t").getResultList();
    }
}
