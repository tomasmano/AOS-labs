
/*
 * 
 */

package simplefileserver.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.3.1
 * Sun Oct 28 18:37:02 CET 2012
 * Generated source version: 2.3.1
 * 
 */


@WebServiceClient(name = "SimpleFileServerImplService", 
                  wsdlLocation = "http://localhost:8081/cxf_spring/SimpleFileServer?wsdl",
                  targetNamespace = "http://server.simplefileserver/") 
public class SimpleFileServerImplService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://server.simplefileserver/", "SimpleFileServerImplService");
    public final static QName SimpleFileServerImplPort = new QName("http://server.simplefileserver/", "SimpleFileServerImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8082/cxf_spring/SimpleFileServer?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://localhost:8082/cxf_spring/SimpleFileServer?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public SimpleFileServerImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SimpleFileServerImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SimpleFileServerImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public SimpleFileServerImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }
    public SimpleFileServerImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SimpleFileServerImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SimpleFileServer
     */
    @WebEndpoint(name = "SimpleFileServerImplPort")
    public SimpleFileServer getSimpleFileServerImplPort() {
        return super.getPort(SimpleFileServerImplPort, SimpleFileServer.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SimpleFileServer
     */
    @WebEndpoint(name = "SimpleFileServerImplPort")
    public SimpleFileServer getSimpleFileServerImplPort(WebServiceFeature... features) {
        return super.getPort(SimpleFileServerImplPort, SimpleFileServer.class, features);
    }

}
