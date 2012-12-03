package cz.cvut.aos.interfaceserver.service.exception;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public class SeatNotAvailable extends Exception {

    public SeatNotAvailable() {
    }

    public SeatNotAvailable(String message) {
        super(message);
    }

    public SeatNotAvailable(String message, Throwable cause) {
        super(message, cause);
    }

    public SeatNotAvailable(Throwable cause) {
        super(cause);
    }
    
}
