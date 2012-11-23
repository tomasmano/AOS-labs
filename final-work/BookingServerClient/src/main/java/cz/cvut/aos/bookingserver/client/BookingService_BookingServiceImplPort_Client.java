
package cz.cvut.aos.bookingserver.client;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.3.1
 * Thu Nov 22 17:33:26 CET 2012
 * Generated source version: 2.3.1
 * 
 */

public final class BookingService_BookingServiceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://webservice.bookingserver.aos.cvut.cz/", "BookingServiceImplService");

    private BookingService_BookingServiceImplPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = BookingServiceImplService.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        BookingServiceImplService ss = new BookingServiceImplService(wsdlURL, SERVICE_NAME);
        BookingService port = ss.getBookingServiceImplPort();  
        
        {
        System.out.println("Invoking findFlightWithTime...");
        java.lang.String _findFlightWithTime_arg0 = "";
        java.lang.String _findFlightWithTime_arg1 = "";
        javax.xml.datatype.XMLGregorianCalendar _findFlightWithTime_arg2 = null;
        java.util.List<cz.cvut.aos.bookingserver.client.Flight> _findFlightWithTime__return = port.findFlightWithTime(_findFlightWithTime_arg0, _findFlightWithTime_arg1, _findFlightWithTime_arg2);
        System.out.println("findFlightWithTime.result=" + _findFlightWithTime__return);


        }
        {
        System.out.println("Invoking getFlightCapacity...");
        java.lang.Long _getFlightCapacity_arg0 = null;
        int _getFlightCapacity__return = port.getFlightCapacity(_getFlightCapacity_arg0);
        System.out.println("getFlightCapacity.result=" + _getFlightCapacity__return);


        }
        {
        System.out.println("Invoking bookFlight...");
        java.lang.Long _bookFlight_arg0 = null;
        try {
            cz.cvut.aos.bookingserver.client.AirTicket _bookFlight__return = port.bookFlight(_bookFlight_arg0);
            System.out.println("bookFlight.result=" + _bookFlight__return);

        } catch (FlightCapacityExceededException_Exception e) { 
            System.out.println("Expected exception: FlightCapacityExceededException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking findFlight...");
        java.lang.String _findFlight_arg0 = "";
        java.lang.String _findFlight_arg1 = "";
        java.util.List<cz.cvut.aos.bookingserver.client.Flight> _findFlight__return = port.findFlight(_findFlight_arg0, _findFlight_arg1);
        System.out.println("findFlight.result=" + _findFlight__return);


        }

        System.exit(0);
    }

}