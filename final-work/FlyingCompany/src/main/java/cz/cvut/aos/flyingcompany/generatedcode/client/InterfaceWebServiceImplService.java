
/*
 * 
 */

package cz.cvut.aos.flyingcompany.generatedcode.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.3.1
 * Wed Dec 12 14:09:34 CET 2012
 * Generated source version: 2.3.1
 * 
 */


@WebServiceClient(name = "InterfaceWebServiceImplService", 
                  wsdlLocation = "http://localhost:8081/InterfaceServer/InterfaceService?wsdl",
                  targetNamespace = "http://webservice.interfaceserver.aos.cvut.cz/") 
public class InterfaceWebServiceImplService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://webservice.interfaceserver.aos.cvut.cz/", "InterfaceWebServiceImplService");
    public final static QName InterfaceWebServiceImplPort = new QName("http://webservice.interfaceserver.aos.cvut.cz/", "InterfaceWebServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8081/InterfaceServer/InterfaceService?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://localhost:8081/InterfaceServer/InterfaceService?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public InterfaceWebServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public InterfaceWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InterfaceWebServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public InterfaceWebServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }
    public InterfaceWebServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public InterfaceWebServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns InterfaceWebService
     */
    @WebEndpoint(name = "InterfaceWebServiceImplPort")
    public InterfaceWebService getInterfaceWebServiceImplPort() {
        return super.getPort(InterfaceWebServiceImplPort, InterfaceWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InterfaceWebService
     */
    @WebEndpoint(name = "InterfaceWebServiceImplPort")
    public InterfaceWebService getInterfaceWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(InterfaceWebServiceImplPort, InterfaceWebService.class, features);
    }

}
