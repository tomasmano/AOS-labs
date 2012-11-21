package cz.cvut.aos.printingserver.service;

import cz.cvut.aos.printingserver.model.AirTicketCopy;
import cz.cvut.aos.printingserver.model.Flight;
import cz.cvut.aos.printingserver.model.User;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
//import org.apache.commons.
import org.springframework.stereotype.Service;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@Service("printingServiceBean")
public class PrintingServiceImpl implements PrintingService {

    @Override
    public AirTicketCopy printAirTicket(Flight flight, User user) {
        File file = writeAirTicket(flight, user);
        return new AirTicketCopy(new DataHandler(new FileDataSource(file)));
    }

    private File writeAirTicket(Flight flight, User user) {
        String data = "Dear "+user.getFirstName()+" "+user.getLastName()+" \n Here is your ticket: "
                + "From: "+flight.getSource()+", to: "+flight.getTarget()+" departure: "+flight.getFlightTime()+" price: "+flight.getPrice()+". \n Thank you for the purchase.";
        File file = null;
        PrintWriter out = null;
        try {
            file = new File("ticket.txt");
            out = new PrintWriter(file);
            out.print(data);
            out.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
        return file;
    }
}
