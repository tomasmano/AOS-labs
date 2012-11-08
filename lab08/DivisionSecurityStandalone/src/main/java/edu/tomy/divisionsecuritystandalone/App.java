package edu.tomy.divisionsecuritystandalone;

import org.apache.cxf.tools.wsdlto.WSDLToJava;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // server code
//        WSDLToJava.main(new String[]{
//                    "-server",
//                    "-d",
//                    "src/main/java",
//                    "-p",
//                    "concatsecuritydemo.server",
//                    "/home/tomy/NetBeansProjects/AOS-labs/lab08/concat.xml"
//                });
//    }
// client code generator
        WSDLToJava.main(new String[]{
                    "-client",
                    "-d",
                    "src/main/java",
                    "-p",
                    "simplefileserver.client",
                    "http://localhost:8082/?wsdl"
                });

        System.out.println("Done!");
    }   

}