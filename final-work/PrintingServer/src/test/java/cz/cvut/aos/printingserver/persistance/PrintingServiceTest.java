package cz.cvut.aos.printingserver.persistance;

import cz.cvut.aos.printingserver.model.AirTicket;
import cz.cvut.aos.printingserver.model.AirTicketCopy;
import cz.cvut.aos.printingserver.model.Flight;
import cz.cvut.aos.printingserver.model.User;
import cz.cvut.aos.printingserver.service.exception.PrintingException;
import cz.cvut.aos.printingserver.webservice.PrintingService;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import javax.activation.DataHandler;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public class PrintingServiceTest extends AbstractServiceTest {

    @Autowired
    @Qualifier("printingServiceClient")
    PrintingService printingService;

    @Ignore
    @Test
    public void test_printing_service() throws PrintingException {
        AirTicket airTicket = new AirTicket();
        airTicket.setFlight(new Flight(1L, Timestamp.valueOf("2012-12-20 12:00:00"), 234, "paris", "prague", 200));
        airTicket.setSeatNumber(34);
        User user = new User("tomas", "mano");
        AirTicketCopy airTicketCopy = printingService.printAirTicket(airTicket, user);
        DataHandler file = airTicketCopy.getAirTicketData();
        try {
            FileOutputStream out = new FileOutputStream("newticket.txt");
            file.writeTo(out);
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
