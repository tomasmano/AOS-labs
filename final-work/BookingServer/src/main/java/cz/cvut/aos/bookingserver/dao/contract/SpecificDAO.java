package cz.cvut.aos.bookingserver.dao.contract;

import cz.cvut.aos.bookingserver.model.common.Persistable;
import java.io.Serializable;
import java.util.List;

/**
 * Contract for a specific DAO that provides common operations on datastore for
 * the particular entity type.
 *
 * Based on Pavel Micka's DAO Dispatcher pattern and Jakub Jirutka's
 * implementation. For details on the original implementation visit
 * <https://github.com/jirutka/commons-persistence/>. Thanks.
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 *
 * @param <ENTITY> an entity type
 * @param <PK> a primary key type
 */
public interface SpecificDAO<ENTITY extends Persistable, PK extends Serializable> {

    /**
     * Return the entity class of this DAO.
     *
     * @return the entity class
     */
    Class<ENTITY> getEntityClass();

    /**
     * Returns all entities ordered by primary key.
     *
     * @return collection containing all entities.
     */
    public List<ENTITY> getAll();

    /**
     * Returns the number of entities.
     *
     * @return the number of entities.
     */
    public Long getCount();

    /**
     * Removes the entity with given id.
     *
     * @param id the id of the entity to deleted.
     */
    public void delete(PK id);

    /**
     * Removes the entity.
     *
     * @param o the entity to deleted.
     */
    public void delete(ENTITY o);

    /**
     * Persists or merges given entity (either attached or detached). Returned
     * entity will be atteched.
     *
     * @param o the entity to be persisted or merged.
     * @return attached entity.
     */
    public <ENTITY extends Persistable> ENTITY save(ENTITY o);

    /**
     * Persists or merges given entity (either attached or detached). Returned
     * entity will be atteched.
     *
     * @param o the entity to be persisted or merged.
     * @return attached entity.
     */
    public ENTITY saveOrUpdate(ENTITY o);

    /**
     * Merges given entity.
     *
     * @param o the entity to be merged.
     */
    public void merge(ENTITY o);

    /**
     * Returns entity with given of given class with given id.
     *
     * @param id the id of the entity to deleted.
     * @return entity identified by given id,
     * @null if doesn't exists.
     */
    public ENTITY findById(PK id);

    /**
     * Get all entities by property
     *
     * @param property the property to select
     * @param value value of the property
     * @return collections containing all of the entities with given property
     * and value.
     */
    public List<ENTITY> findByProperty(String property, Object value);

    /**
     * Updates given property by value in entity with matching id.
     *
     * @param id the id of the entity to updated
     * @param property name of the property
     * @param value value of the property
     */
    public <PK extends Serializable> boolean updateSimplePropertyByValue(PK id, String property, Object value);

    /**
     * Returns <tt>true</tt> if entity with given id is persisent.
     *
     * @return true if entity is persistent.
     */
    public boolean isPersistent(PK id);
}
