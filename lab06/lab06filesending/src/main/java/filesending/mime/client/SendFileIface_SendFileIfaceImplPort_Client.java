
package filesending.mime.client;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.xml.namespace.QName;

/**
 * This class was generated by Apache CXF 2.3.1
 * Thu Oct 25 10:37:01 CEST 2012
 * Generated source version: 2.3.1
 * 
 */

public final class SendFileIface_SendFileIfaceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://server.mime.filesending/", "SendFileIfaceImplService");

    private SendFileIface_SendFileIfaceImplPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = SendFileIfaceImplService.WSDL_LOCATION;
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
      
        SendFileIfaceImplService ss = new SendFileIfaceImplService(wsdlURL, SERVICE_NAME);
        SendFileIface port = ss.getSendFileIfaceImplPort();  
        
        {
        System.out.println("Invoking sendFile...");
        
        FileDataSource ds = new FileDataSource("src/main/resources/image.jpg");
        
        javax.activation.DataHandler _sendFile_arg0 = new DataHandler(ds);
        port.sendFile(_sendFile_arg0);


        }

        System.exit(0);
    }

}