package edu.tomy.lab05;

import org.apache.cxf.tools.wsdlto.WSDLToJava;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        WSDLToJava.main(new String[]{
                    "-server",
                    "-d",
                    "src/main/java",
                    "-p",
                    "concat",
                    "/home/tomy/NetBeansProjects/AOS-labs/lab05/src/main/resources/concatenation.xml"
                });
        System.out.println("Done!");
    }
}
