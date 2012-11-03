
/*
 * 
 */

package generatedcode.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.3.1
 * Sat Nov 03 15:36:47 CET 2012
 * Generated source version: 2.3.1
 * 
 */


@WebServiceClient(name = "Info", 
                  wsdlLocation = "http://footballpool.dataaccess.eu/data/info.wso?WSDL",
                  targetNamespace = "http://footballpool.dataaccess.eu") 
public class Info extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://footballpool.dataaccess.eu", "Info");
    public final static QName InfoSoap = new QName("http://footballpool.dataaccess.eu", "InfoSoap");
    static {
        URL url = null;
        try {
            url = new URL("http://footballpool.dataaccess.eu/data/info.wso?WSDL");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://footballpool.dataaccess.eu/data/info.wso?WSDL");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public Info(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Info(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Info() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public Info(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }
    public Info(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Info(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns InfoSoapType
     */
    @WebEndpoint(name = "InfoSoap")
    public InfoSoapType getInfoSoap() {
        return super.getPort(InfoSoap, InfoSoapType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InfoSoapType
     */
    @WebEndpoint(name = "InfoSoap")
    public InfoSoapType getInfoSoap(WebServiceFeature... features) {
        return super.getPort(InfoSoap, InfoSoapType.class, features);
    }

}