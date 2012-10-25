
package division.client;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.3.1
 * Thu Oct 25 09:50:43 CEST 2012
 * Generated source version: 2.3.1
 * 
 */

public final class DivisionServiceIface_DivisionServiceIfaceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://division/", "DivisionServiceIfaceImplService");

    private DivisionServiceIface_DivisionServiceIfaceImplPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = DivisionServiceIfaceImplService.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        DivisionServiceIfaceImplService ss = new DivisionServiceIfaceImplService(wsdlURL, SERVICE_NAME);
        DivisionServiceIface port = ss.getDivisionServiceIfaceImplPort();  
        
        {
        System.out.println("Invoking divide...");
        float _divide_arg0 = 10;
        float _divide_arg1 = 0;
        try {
            float _divide__return = port.divide(_divide_arg0, _divide_arg1);
            System.out.println("divide.result=" + _divide__return);

        } catch (DivisionByZeroExceptionException e) { 
            System.out.println("Expected exception: DivisionByZeroException_Exception has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
