package cz.cvut.aos.bookingserver.dao.contract;

import cz.cvut.aos.bookingserver.model.common.Persistable;
import java.io.Serializable;
import java.util.List;

/**
 * Contract for the Generic DAO that provides common operations on datastore. 
 * 
 * Based on Pavel Micka's DAO Dispatcher pattern and Jakub Jirutka's implementation. 
 * For details on the original implementation visit <https://github.com/jirutka/commons-persistence/>. Thanks.
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */

public interface GenericDAO {
    
    /**
     * Returns all entities of given class ordered by primary key.
     * 
     * @param clazz class of an entity.
     * @return all entities of given class.
     */
    public <ENTITY extends Persistable> List<ENTITY> getAll(Class<ENTITY> clazz);

    /**
     * Returns the number of entities of given class.
     * 
     * @param clazz trida.
     * @return the number of entities.
     */
    public Long getCount(Class<? extends Persistable> clazz);
    
    /**
     * Removes the entity with given id.
     * 
     * @param id the id of the entity to deleted.
     */
    public void delete(Serializable id, Class<? extends Persistable> clazz);
    
    /**
     * Removes the entity.
     * 
     * @param o the entity to deleted.
     */
    public void delete(Persistable o);
    
    /**
     * Persists the given entity.
     * 
     * @param o entity to be persisted.
     * @return persisted entity.
     */
    public <ENTITY extends Persistable> ENTITY save(ENTITY o);

    /**
     * Persists or merges given entity (either attached or detached).
     * Returned entity will be atteched.
     * 
     * @param o the entity to be persisted or merged.
     * @return attached entity.
     */
    public <ENTITY extends Persistable> ENTITY saveOrUpdate(ENTITY o);
    
    /**
     * Merges given entity.
     *
     * @param o the entity to be merged.
     */
    public void merge(Persistable o);

    /**
     * Returns entity with given of given class with given id.
     * 
     * @param id the id of the entity to deleted.
     * @return entity identified by given id, @null if doesn't exists.
     */
    public <ENTITY extends Persistable> ENTITY findById(Serializable id, Class<ENTITY> clazz);

    /**
     * Get all entities by property
     * 
     * @param property the property to select
     * @param value value of the property
     * @return collections containing all of the entities with given property and value.
     */
    public <ENTITY extends Persistable> List<ENTITY> findByProperties(String[] property, Object[] value, Class<ENTITY> clazz);
    
    /**
     * Updates given property by value in entity with matching id.
     * 
     * @param id the id of the entity to updated
     * @param property name of the property
     * @param value value of the property
     */
    public <ENTITY extends Persistable, PK extends Serializable> boolean updateSimplePropertyByValue(PK id, String property, Object value, Class<ENTITY> clazz);
   
    /**
     * Returns <tt>true</tt> if entity with given id is persisent.
     *
     * @return true if entity is persistent.
     */
    public boolean isPersistent(Serializable id, Class<? extends Persistable> clazz);

}
