package cz.cvut.aos.printingserver.client.app;

import cz.cvut.aos.printingserver.client.AirTicketCopy;
import cz.cvut.aos.printingserver.client.Flight;
import cz.cvut.aos.printingserver.client.User;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
//        WSDLToJava.main(new String[]{
//                    "-client",
//                    "-d",
//                    "src/main/java",
//                    "-p",
//                    "cz.cvut.aos.printingserver.client",
//                    "http://localhost:8081/PrintingServer/PrintingService?wsdl"
//                });
//
//        System.out.println("Done!");
        printAirTicket(new Flight(null, 199, "praha", "paris"), new User("TOmy", "Mano"));
    }

    public static AirTicketCopy printAirTicket(Flight flight, User user) {
        File file = writeAirTicket(flight, user);
        return new AirTicketCopy(new DataHandler(new FileDataSource(file)));
    }

    public static File writeAirTicket(Flight flight, User user) {
        String data = "Dear " + user.getFirstName() + " " + user.getLastName() + " \n Here is your ticket: "
                + "From: " + flight.getSource() + ", to: " + flight.getTarget();
        File file = null;
        PrintWriter out = null;
        FileWriter fileWriter = null;;
        try {
            file = new File("ticket.txt");
            fileWriter = new FileWriter(file);
            System.out.println(">>>> file: " + file);
//            out = new PrintWriter(file);
//            out.print(data);
            fileWriter.write(data);
            fileWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return file;
    }
}
