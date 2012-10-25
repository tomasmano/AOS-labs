
package filesending.base64.server;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.3.1
 * Thu Oct 25 10:02:35 CEST 2012
 * Generated source version: 2.3.1
 * 
 */
 
public class SendFileIface_SendFilePort_Server{

    protected SendFileIface_SendFilePort_Server() throws Exception {
        System.out.println("Starting Server");
        Object implementor = new SendFileIfaceImpl();
        String address = "http://localhost:8099/cxf_spring/SendFile";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws Exception { 
        new SendFileIface_SendFilePort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}