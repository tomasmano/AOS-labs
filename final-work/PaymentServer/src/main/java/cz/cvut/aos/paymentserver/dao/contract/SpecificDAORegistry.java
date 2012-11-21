package cz.cvut.aos.paymentserver.dao.contract;

import cz.cvut.aos.paymentserver.dao.impl.GenericDAODispatcher;
import cz.cvut.aos.paymentserver.model.common.Persistable;


/**
 * Interface of the {@linkplain SpecificDAO specific DAOs} registry for a
 * {@linkplain GenericDAODispatcher DAO dispatcher}.
 *
 * Based on Pavel Micka's DAO Dispatcher pattern and Jakub Jirutka's
 * implementation. For details on the original implementation visit
 * <https://github.com/jirutka/commons-persistence/>. Thanks.
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 *
 * @param <DAO> {@link SpecificDAO} type (optionally)
 */
public interface SpecificDAORegistry<DAO extends SpecificDAO, ENTITY extends Persistable> {

    /**
     * Does it contain {@linkplain SpecificDAO} for the given entity class?
     *
     * @param entityClass an entity class
     * @return <tt>true</tt> if contains suitable DAO, <tt>false</tt> otherwise
     */
    boolean containsDAO(Class<ENTITY> entityClass);

    /**
     * Return the specific DAO for the given entity class.
     *
     * @param entityClass an entity class
     * @return the <tt>SpecificDAO</tt> instance
     */
    DAO getDAO(Class<ENTITY> entityClass);

    /**
     * Register the given specific DAO.
     *
     * @param specificDAO a <tt>SpecificDAO</tt> instance
     */
    void register(DAO specificDAO);

    /**
     * Unregister the given specific DAO.
     *
     * @param specificDAO a <tt>SpecificDAO</tt> instance
     */
    void unRegister(DAO specificDAO);
}
