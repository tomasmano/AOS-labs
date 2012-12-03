package cz.cvut.aos.interfaceserver.service.exception;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public class UnsupportedPaymentTypeException extends Exception {

    public UnsupportedPaymentTypeException() {
    }

    public UnsupportedPaymentTypeException(String message) {
        super(message);
    }

    public UnsupportedPaymentTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnsupportedPaymentTypeException(Throwable cause) {
        super(cause);
    }
    
}
