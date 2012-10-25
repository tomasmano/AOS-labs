package edu.tomy.lab05;

import org.apache.cxf.tools.wsdlto.WSDLToJava;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
// server code
        //        WSDLToJava.main(new String[]{
//                    "-server",
//                    "-d",
//                    "src/main/java",
//                    "-p",
//                    "filesending.base64.server",
//                    "/home/tomy/NetBeansProjects/AOS-labs/lab06/lab06filesending/src/main/resources/filesending-base64.xml"
//                });
        
        // client code generator
        WSDLToJava.main(new String[]{
                    "-client",
                    "-d",
                    "src/main/java",
                    "-p",
                    "filesending.base64.client",
                    "http://localhost:8099/cxf_spring/SendFile?wsdl"
                });
        
        System.out.println("Done!");
    }
}
