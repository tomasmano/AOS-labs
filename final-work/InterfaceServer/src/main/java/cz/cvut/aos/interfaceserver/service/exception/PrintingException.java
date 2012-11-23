package cz.cvut.aos.interfaceserver.service.exception;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public class PrintingException extends Exception{

    public PrintingException() {
    }

    public PrintingException(String message) {
        super(message);
    }

    public PrintingException(String message, Throwable cause) {
        super(message, cause);
    }

    public PrintingException(Throwable cause) {
        super(cause);
    }
    
}
