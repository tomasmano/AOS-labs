package cz.cvut.aos.paymentserver.dao.impl;

import cz.cvut.aos.paymentserver.dao.contract.GenericDAO;
import cz.cvut.aos.paymentserver.model.common.Persistable;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

/**
 * Hibernate JPA implementation of the {@link GenericDAO} interface.
 *
 * Based on Pavel Micka's DAO Dispatcher pattern and Jakub Jirutka's
 * implementation. For details on the original implementation visit
 * <https://github.com/jirutka/commons-persistence/>. Thanks.
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@Repository("genericHibernateJpa2DAO")
public class GenericHibernateJpa2DAO implements GenericDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public <ENTITY extends Persistable> List<ENTITY> getAll(Class<ENTITY> clazz) {
        return em.createQuery("SELECT e FROM " + clazz.getSimpleName() + " e").getResultList();
    }

    @Override
    public Long getCount(Class<? extends Persistable> clazz) {
        Long size = new Long(em.createQuery("SELECT e FROM " + clazz.getSimpleName() + " e").getResultList().size());
        return size;
    }

    @Override
    public void delete(Serializable id, Class<? extends Persistable> clazz) {
        Persistable o = em.find(clazz, id);
        if (o != null) {
            em.remove(o);
        }
    }

    @Override
    public void delete(Persistable o) {
        em.remove(o);
    }

    @Override
    public <ENTITY extends Persistable> ENTITY save(ENTITY o) {
        em.persist(o);
        return o;
    }

    @Override
    public <ENTITY extends Persistable> ENTITY saveOrUpdate(ENTITY o) {
        if (o.getId() == null) {
            em.persist(o);
        } else {
            em.merge(o);
        }
        return o;
    }

    @Override
    public void merge(Persistable o) {
        em.merge(o);
    }

    @Override
    public <ENTITY extends Persistable> ENTITY findById(Serializable id, Class<ENTITY> clazz) {
        return em.find(clazz, id);
    }

    @Override
    public <ENTITY extends Persistable> List<ENTITY> findByProperties(String[] property, Object[] value, Class<ENTITY> clazz) {
        String queryString = "SELECT e FROM " + clazz.getSimpleName() + " e WHERE e." + property[0] + " = :value0 AND " + property[1] + "= :value1";
        return em.createQuery(queryString).setParameter("value0", value[0]).setParameter("value1", value[1]).getResultList();
    }
    
    @Override
    public <ENTITY extends Persistable, PK extends Serializable> boolean updateSimplePropertyByValue(PK id, String property, Object value, Class<ENTITY> clazz){
        String queryString = "UPDATE "+clazz.getSimpleName()+" AS e SET e."+property+"=:value WHERE e.id="+id;
        int result = em.createQuery(queryString).setParameter("value", value).executeUpdate();
        return result == 0 ? false : true;
    }

    @Override
    public boolean isPersistent(Serializable id, Class<? extends Persistable> clazz) {
        return em.find(clazz, id) == null ? false : true;
    }

}
