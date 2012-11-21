package cz.cvut.aos.paymentserver.dao.impl;

import cz.cvut.aos.paymentserver.dao.contract.SpecificDAO;
import cz.cvut.aos.paymentserver.dao.contract.SpecificDAORegistry;
import cz.cvut.aos.paymentserver.model.common.Persistable;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Default implementation of the {@linkplain SpecificDAORegistry} interface for
 * generic {@linkplain SpecificDAO} that stores DAOs in internal hashmap.
 *
 * Based on Pavel Micka's DAO Dispatcher pattern and Jakub Jirutka's
 * implementation. For details on the original implementation visit
 * <https://github.com/jirutka/commons-persistence/>. Thanks.
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@Component("inMemoryDAORegistry")
public class InMemorySpecificDAORegistry implements SpecificDAORegistry<SpecificDAO, Persistable> {

    private static final Logger LOG = LoggerFactory.getLogger(InMemorySpecificDAORegistry.class);
    private final Map<Class, SpecificDAO> registry = new HashMap<Class, SpecificDAO>();

    @Override
    public boolean containsDAO(Class<Persistable> entityClass) {
        return registry.containsKey(entityClass);
    }

    @Override
    public SpecificDAO getDAO(Class<Persistable> entityClass) {
        return registry.get(entityClass);
    }

    @Override
    public void register(SpecificDAO specificDAO) {
        LOG.info("Registering Specific DAO for entity class: {}", specificDAO.getEntityClass());
        registry.put(specificDAO.getEntityClass(), specificDAO);
    }

    @Override
    public void unRegister(SpecificDAO specificDAO) {
        LOG.info("Removing Specific DAO for entity class from registry: {}", specificDAO.getEntityClass());
        registry.remove(specificDAO.getEntityClass());
    }
}
