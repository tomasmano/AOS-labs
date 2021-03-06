
package cz.cvut.aos.bookingserver.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.3.1
 * Thu Nov 22 17:33:26 CET 2012
 * Generated source version: 2.3.1
 * 
 */

@WebFault(name = "FlightCapacityExceededException", targetNamespace = "http://webservice.bookingserver.aos.cvut.cz/")
public class FlightCapacityExceededException_Exception extends Exception {
    public static final long serialVersionUID = 20121122173326L;
    
    private cz.cvut.aos.bookingserver.client.FlightCapacityExceededException flightCapacityExceededException;

    public FlightCapacityExceededException_Exception() {
        super();
    }
    
    public FlightCapacityExceededException_Exception(String message) {
        super(message);
    }
    
    public FlightCapacityExceededException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public FlightCapacityExceededException_Exception(String message, cz.cvut.aos.bookingserver.client.FlightCapacityExceededException flightCapacityExceededException) {
        super(message);
        this.flightCapacityExceededException = flightCapacityExceededException;
    }

    public FlightCapacityExceededException_Exception(String message, cz.cvut.aos.bookingserver.client.FlightCapacityExceededException flightCapacityExceededException, Throwable cause) {
        super(message, cause);
        this.flightCapacityExceededException = flightCapacityExceededException;
    }

    public cz.cvut.aos.bookingserver.client.FlightCapacityExceededException getFaultInfo() {
        return this.flightCapacityExceededException;
    }
}
