package filesending.base64.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.3.1
 * Thu Oct 25 10:02:34 CEST 2012
 * Generated source version: 2.3.1
 * 
 */
 
@WebService(targetNamespace = "http://testing/", name = "SendFileIface")
@XmlSeeAlso({ObjectFactory.class})
public interface SendFileIface {

    @RequestWrapper(localName = "sendFile", targetNamespace = "http://testing/", className = "filesending.base64.server.SendFile")
    @WebMethod
    @ResponseWrapper(localName = "sendFileResponse", targetNamespace = "http://testing/", className = "filesending.base64.server.SendFileResponse")
    public void sendFile(
        @WebParam(name = "arg0", targetNamespace = "")
        byte[] arg0
    );
}
