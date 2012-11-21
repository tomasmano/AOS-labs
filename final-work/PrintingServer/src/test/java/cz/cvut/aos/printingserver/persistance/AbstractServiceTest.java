package cz.cvut.aos.printingserver.persistance;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * 
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/context-test.xml")
@TransactionConfiguration( defaultRollback = true )
@Transactional
public abstract class AbstractServiceTest {

    public AbstractServiceTest() {
    }
    
}
