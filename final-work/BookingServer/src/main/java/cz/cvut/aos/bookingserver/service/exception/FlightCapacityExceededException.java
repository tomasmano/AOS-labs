package cz.cvut.aos.bookingserver.service.exception;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public class FlightCapacityExceededException extends Exception{

    public FlightCapacityExceededException() {
    }

    public FlightCapacityExceededException(String message) {
        super(message);
    }

    public FlightCapacityExceededException(String message, Throwable cause) {
        super(message, cause);
    }

    public FlightCapacityExceededException(Throwable cause) {
        super(cause);
    }
    
}
