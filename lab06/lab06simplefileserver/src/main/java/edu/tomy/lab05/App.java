package edu.tomy.lab05;

import java.awt.print.Book;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.cxf.tools.wsdlto.WSDLToJava;

/**
 * Hello world!
 *
 */
public class App {
    
    public static void main(String[] args) {
        
// server code
//                WSDLToJava.main(new String[]{
//                    "-server",
//                    "-d",
//                    "src/main/java",
//                    "-p",
//                    "simplefileserver.server",
//                    "/home/tomy/NetBeansProjects/AOS-labs/lab06/lab06simplefileserver/src/main/resources/simple-file-server.xml"
//                });
        
        // client code generator
        WSDLToJava.main(new String[]{
                    "-client",
                    "-d",
                    "src/main/java",
                    "-p",
                    "simplefileserver.client",
                    "http://localhost:8081/cxf_spring/SimpleFileServer?wsdl"
                });

        System.out.println("Done!");
    }
}
