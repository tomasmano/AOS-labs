package cz.cvut.aos.paymentserver.dao.impl;

import cz.cvut.aos.paymentserver.dao.contract.SpecificDAORegistry;
import cz.cvut.aos.paymentserver.dao.contract.SpecificDAO;
import cz.cvut.aos.paymentserver.dao.contract.GenericDAO;
import cz.cvut.aos.paymentserver.model.common.Persistable;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;
import org.apache.commons.lang3.reflect.TypeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Root abstract class in SpecificDAO hierarchy. Abstract class implementing
 * {@link SpecificDAO} for Hibernate JPA. Default specific DAO implementation.
 * All method calls are delegated to {@link GenericDAO}.
 *
 * Based on Pavel Micka's DAO Dispatcher pattern and Jakub Jirutka's
 * implementation. For details on the original implementation visit
 * <https://github.com/jirutka/commons-persistence/>. Thanks.
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 *
 * @param <ENTITY> an entity class type
 * @param <PK> an identifier type
 */
@Component("defaultSpecificDAO")
public abstract class DefaultSpecificDAO<ENTITY extends Persistable, PK extends Serializable> implements SpecificDAO<ENTITY, PK> {

    private static final Logger LOG = LoggerFactory.getLogger(DefaultSpecificDAO.class);
    
    @Autowired
    @Qualifier("genericHibernateJpa2DAO")
    private GenericDAO genericDAO;
    
    @Autowired
    @Qualifier("inMemoryDAORegistry")
    private SpecificDAORegistry registry;
    
    private Class<ENTITY> entityClass;

    public DefaultSpecificDAO(GenericDAO genericDAO) {
        this.genericDAO = genericDAO;
        this.entityClass = determineEntityClass();
        LOG.debug("Initializing {} for entity {}", this.getClass().getSimpleName(), entityClass.getSimpleName());
    }

    /**
     * If you want to use non-parametric constructor, then you MUST
     * {@linkplain #setGenericDAO() set genericDAO} manually just after
     * initialization! This is useful when you're using some DI framework like
     * Spring.
     */
    public DefaultSpecificDAO() {
        this(null);
    }

    private Class<ENTITY> determineEntityClass() {
        TypeVariable<?> typeVarE = DefaultSpecificDAO.class.getTypeParameters()[0];
        Type implType = this.getClass();

        return (Class<ENTITY>) TypeUtils.getTypeArguments(implType, DefaultSpecificDAO.class).get(typeVarE);
    }
    
    private Class<ENTITY> determineEntityClassWithoutApache() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        Type[] types = genericSuperclass.getActualTypeArguments();
        Class clazz = (Class) types[0];
        return clazz;
    }

    @Override
    public Class<ENTITY> getEntityClass() {
        return entityClass;
    }

    @Override
    public List<ENTITY> getAll() {
        return genericDAO.getAll(entityClass);
    }

    @Override
    public Long getCount() {
        return genericDAO.getCount(entityClass);
    }

    @Override
    public void delete(PK id) {
        genericDAO.delete(id, entityClass);
    }

    @Override
    public void delete(ENTITY o) {
        genericDAO.delete(o);
    }

    @Override
    public <ENTITY extends Persistable> ENTITY save(ENTITY o) {
        return genericDAO.save(o);
    }

    @Override
    public ENTITY saveOrUpdate(ENTITY o) {
        return genericDAO.saveOrUpdate(o);
    }

    @Override
    public void merge(ENTITY o) {
        genericDAO.merge(o);
    }

    @Override
    public ENTITY findById(PK id) {
        return genericDAO.findById(id, entityClass);
    }

    @Override
    public List<ENTITY> findByProperties(String[] property, Object[] value) {
        return genericDAO.findByProperties(property, value, entityClass);
    }

    @Override
    public <PK extends Serializable> boolean updateSimplePropertyByValue(PK id, String property, Object value) {
        return genericDAO.updateSimplePropertyByValue(id, property, value, entityClass);
    }

    @Override
    public boolean isPersistent(PK id) {
        return genericDAO.isPersistent(id, entityClass);
    }
    
    //////////  Getters / Setters  //////////

    public GenericDAO getGenericDAO() {
        return genericDAO;
    }

    public void setGenericDAO(GenericDAO genericDAO) {
        this.genericDAO = genericDAO;
    }

    public SpecificDAORegistry getRegistry() {
        return registry;
    }

    public void setRegistry(SpecificDAORegistry registry) {
        this.registry = registry;
    }
    
}
