package cz.cvut.aos.bookingserver.service.exception;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public class UnknownAirTicketException extends Exception {

    public UnknownAirTicketException() {
    }

    public UnknownAirTicketException(String message) {
        super(message);
    }

    public UnknownAirTicketException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnknownAirTicketException(Throwable cause) {
        super(cause);
    }
    
}
