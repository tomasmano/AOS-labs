package cz.cvut.aos.bookingserver.service.exception;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public class UnknownFlightException extends Exception {

    public UnknownFlightException() {
    }

    public UnknownFlightException(String message) {
        super(message);
    }

    public UnknownFlightException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnknownFlightException(Throwable cause) {
        super(cause);
    }
    
}
