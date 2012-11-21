package cz.cvut.aos.paymentserver.dao.impl;

import cz.cvut.aos.paymentserver.dao.contract.GenericDAO;
import cz.cvut.aos.paymentserver.dao.contract.SpecificDAO;
import cz.cvut.aos.paymentserver.dao.contract.SpecificDAORegistry;
import cz.cvut.aos.paymentserver.model.common.Persistable;
import java.io.Serializable;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Basic implementation of the DAO Dispatcher pattern [1] for
 * {@link GenericDAO}.
 * 
 * <p>The dispatcher holds an instance of the <tt>GenericDAO</tt> and a
 * {@linkplain SpecificDAORegistry registry} with {@linkplain SpecificDAO
 * specific DAO} instances. It implements interface of a generic DAO so it can
 * by called with any {@link Persistable} (entity) instance or class. When there
 * is found a suitable specific DAO for the given entity in the registry, method
 * call is delegated to it. Otherwise, it's simply delegated to the generic DAO.
 * </p> 
 * 
 * Based on Pavel Micka's DAO Dispatcher pattern and Jakub Jirutka's
 * implementation. For details on the original implementation visit
 * <https://github.com/jirutka/commons-persistence/>. Thanks.
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@Component("genericDAODispatcher")
public class GenericDAODispatcher implements GenericDAO {

    private static final Logger LOG = LoggerFactory.getLogger(GenericDAODispatcher.class);
    
    @Autowired
    @Qualifier("inMemoryDAORegistry")
    private SpecificDAORegistry registry;
    
    @Autowired
    @Qualifier("genericHibernateJpa2DAO")
    private GenericDAO genericDAO;

    public GenericDAODispatcher() {
    }

    public GenericDAODispatcher(SpecificDAORegistry registry, GenericDAO genericDAO) {
        this.registry = registry;
        this.genericDAO = genericDAO;
    }

    @Override
    public Long getCount(Class clazz) {
        if (registry.containsDAO(clazz)) {
            return registry.getDAO(clazz).getCount();
        } else {
            return genericDAO.getCount(clazz);
        }
    }

    @Override
    public <ENTITY extends Persistable> List<ENTITY> getAll(Class<ENTITY> clazz) {
        if (registry.containsDAO(clazz)) {
            return registry.getDAO(clazz).getAll();
        } else {
            return genericDAO.getAll(clazz);
        }
    }

    @Override
    public void delete(Serializable id, Class<? extends Persistable> clazz) {
        if (registry.containsDAO(clazz)) {
            registry.getDAO(clazz).delete(id);
        } else {
            genericDAO.delete(id, clazz);
        }
    }

    @Override
    public void delete(Persistable o) {
        if (registry.containsDAO(o.getClass())) {
            registry.getDAO(o.getClass()).delete(o);
        } else {
            genericDAO.delete(o);
        }
    }

    @Override
    public <ENTITY extends Persistable> ENTITY save(ENTITY o) {
        if (registry.containsDAO(o.getClass())) {
            return (ENTITY) registry.getDAO(o.getClass()).save(o);
        } else {
            return genericDAO.save(o);
        }
    }

    @Override
    public <ENTITY extends Persistable> ENTITY saveOrUpdate(ENTITY o) {
        if (registry.containsDAO(o.getClass())) {
            return (ENTITY) registry.getDAO(o.getClass()).saveOrUpdate(o);
        } else {
            return genericDAO.saveOrUpdate(o);
        }
    }

    @Override
    public void merge(Persistable o) {
        if (registry.containsDAO(o.getClass())) {
            registry.getDAO(o.getClass()).merge(o);
        } else {
            genericDAO.merge(o);
        }
    }

    @Override
    public <ENTITY extends Persistable> ENTITY findById(Serializable id, Class<ENTITY> clazz) {
        if (registry.containsDAO(clazz)) {
            return (ENTITY) registry.getDAO(clazz).findById(id);
        } else {
            return genericDAO.findById(id, clazz);
        }
    }

    @Override
    public <ENTITY extends Persistable> List<ENTITY> findByProperties(String[] property, Object[] value, Class<ENTITY> clazz) {
        if (registry.containsDAO(clazz)) {
            return registry.getDAO(clazz).findByProperties(property, value);
        } else {
            return genericDAO.findByProperties(property, value, clazz);
        }
    }

    @Override
    public <ENTITY extends Persistable, PK extends Serializable> boolean updateSimplePropertyByValue(PK id, String property, Object value, Class<ENTITY> clazz) {
        if (registry.containsDAO(clazz)) {
            return registry.getDAO(clazz).updateSimplePropertyByValue(id, property, value);
        } else {
            return genericDAO.updateSimplePropertyByValue(id, property, value, clazz);
        }
    }

    @Override
    public boolean isPersistent(Serializable id, Class<? extends Persistable> clazz) {
        if (registry.containsDAO(clazz)) {
            return registry.getDAO(clazz).isPersistent(id);
        } else {
            return genericDAO.isPersistent(id, clazz);
        }
    }
        
    //////////  Getters / Setters  //////////

    public SpecificDAORegistry getRegistry() {
        return registry;
    }

    public void setRegistry(SpecificDAORegistry registry) {
        this.registry = registry;
    }

    public GenericDAO getGenericDAO() {
        return genericDAO;
    }

    public void setGenericDAO(GenericDAO genericDAO) {
        this.genericDAO = genericDAO;
    }
}
