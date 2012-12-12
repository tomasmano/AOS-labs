
package cz.cvut.aos.flyingcompany.generatedcode.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.3.1
 * Wed Dec 12 14:09:34 CET 2012
 * Generated source version: 2.3.1
 * 
 */

@WebFault(name = "PrintingException", targetNamespace = "http://webservice.interfaceserver.aos.cvut.cz/")
public class PrintingException_Exception extends Exception {
    public static final long serialVersionUID = 20121212140934L;
    
    private cz.cvut.aos.flyingcompany.generatedcode.client.PrintingException printingException;

    public PrintingException_Exception() {
        super();
    }
    
    public PrintingException_Exception(String message) {
        super(message);
    }
    
    public PrintingException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public PrintingException_Exception(String message, cz.cvut.aos.flyingcompany.generatedcode.client.PrintingException printingException) {
        super(message);
        this.printingException = printingException;
    }

    public PrintingException_Exception(String message, cz.cvut.aos.flyingcompany.generatedcode.client.PrintingException printingException, Throwable cause) {
        super(message, cause);
        this.printingException = printingException;
    }

    public cz.cvut.aos.flyingcompany.generatedcode.client.PrintingException getFaultInfo() {
        return this.printingException;
    }
}
