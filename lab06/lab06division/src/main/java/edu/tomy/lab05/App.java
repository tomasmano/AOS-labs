package edu.tomy.lab05;

import org.apache.cxf.tools.wsdlto.WSDLToJava;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        WSDLToJava.main(new String[]{
                    "-client",
                    "-d",
                    "src/main/java",
                    "-p",
                    "division.client",
                    "http://localhost:8083/cxf_spring/DivisionService?wsdl"
                });
        System.out.println("Done!");
    }
}
