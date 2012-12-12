
package cz.cvut.aos.flyingcompany.generatedcode.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.3.1
 * Wed Dec 12 14:09:34 CET 2012
 * Generated source version: 2.3.1
 * 
 */

@WebFault(name = "UnknownAccountException", targetNamespace = "http://webservice.interfaceserver.aos.cvut.cz/")
public class UnknownAccountException_Exception extends Exception {
    public static final long serialVersionUID = 20121212140934L;
    
    private cz.cvut.aos.flyingcompany.generatedcode.client.UnknownAccountException unknownAccountException;

    public UnknownAccountException_Exception() {
        super();
    }
    
    public UnknownAccountException_Exception(String message) {
        super(message);
    }
    
    public UnknownAccountException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public UnknownAccountException_Exception(String message, cz.cvut.aos.flyingcompany.generatedcode.client.UnknownAccountException unknownAccountException) {
        super(message);
        this.unknownAccountException = unknownAccountException;
    }

    public UnknownAccountException_Exception(String message, cz.cvut.aos.flyingcompany.generatedcode.client.UnknownAccountException unknownAccountException, Throwable cause) {
        super(message, cause);
        this.unknownAccountException = unknownAccountException;
    }

    public cz.cvut.aos.flyingcompany.generatedcode.client.UnknownAccountException getFaultInfo() {
        return this.unknownAccountException;
    }
}