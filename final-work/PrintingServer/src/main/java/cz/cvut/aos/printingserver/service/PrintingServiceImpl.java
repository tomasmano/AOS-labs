package cz.cvut.aos.printingserver.service;

import cz.cvut.aos.printingserver.model.AirTicket;
import cz.cvut.aos.printingserver.model.AirTicketCopy;
import cz.cvut.aos.printingserver.model.Flight;
import cz.cvut.aos.printingserver.model.User;
import cz.cvut.aos.printingserver.service.exception.PrintingException;
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
    public AirTicketCopy printAirTicket(AirTicket ticket, User user) throws PrintingException{
        File file = writeAirTicket(ticket, user);
        return new AirTicketCopy(new DataHandler(new FileDataSource(file)));
    }

    private File writeAirTicket(AirTicket ticket, User user) {
        Flight flight = ticket.getFlight();
        String data = "Dear "+user.getFirstName()+", \n\nHere is your ticket: "
                + "\n\n   Air ticket number: #"+ticket.getId() +" (this is usefull when you want to f. e. cancell your flight) "
                + "\n   From: "+flight.getSource()+
                ", \n   to: "+flight.getTarget()+
                " , \n   departure: "+flight.getFlightTime()+
                " , \n   seat number: "+ticket.getSeatNumber()+
                " \n   price: "+flight.getPrice()+
                ". \n\nThank you for your purchase.";
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
