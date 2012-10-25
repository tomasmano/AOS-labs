package concat;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.3.1
 * Thu Oct 18 09:57:30 CEST 2012
 * Generated source version: 2.3.1
 * 
 */
 
@WebService(targetNamespace = "http://www.example.org/NewWSDLFile/", name = "concatService")
@XmlSeeAlso({ObjectFactory.class})
public interface ConcatService {

    @WebResult(name = "concatenated", targetNamespace = "")
    @RequestWrapper(localName = "ConcatOperation", targetNamespace = "http://www.example.org/NewWSDLFile/", className = "concat.ConcatOperation")
    @WebMethod(operationName = "ConcatOperation", action = "http://www.example.org/NewWSDLFile/ConcatOperation")
    @ResponseWrapper(localName = "concatResponse", targetNamespace = "http://www.example.org/NewWSDLFile/", className = "concat.ConcatResponse")
    public java.lang.String concatOperation(
        @WebParam(name = "string1", targetNamespace = "")
        java.lang.String string1,
        @WebParam(name = "string2", targetNamespace = "")
        java.lang.String string2
    );
}