package cz.cvut.aos.bookingserver.dao.impl;

import cz.cvut.aos.bookingserver.dao.contract.GenericDAO;
import cz.cvut.aos.bookingserver.model.common.Persistable;
import java.io.Serializable;
import org.springframework.beans.factory.InitializingBean;

/**
 * Decouples Spring-dependent logic. Every SpecificDAO implementation shall 
 * extends this class.
 * 
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 *
 * @param <ENTITY> an entity class type
 * @param <PK> an identifier type
 */
public abstract class SpringBasicSpecificDAO<ENITITY extends Persistable, PK extends Serializable> extends DefaultSpecificDAO<ENITITY, PK> implements InitializingBean {

    public SpringBasicSpecificDAO() {
        super(null);
    }

    public SpringBasicSpecificDAO(GenericDAO genericDAO) {
        super(genericDAO);
    }
    
    @Override
    public void afterPropertiesSet() throws IllegalStateException {
        getRegistry().register(this);
    }
}
