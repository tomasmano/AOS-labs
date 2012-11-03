package edu.tomy.bestgoalscorers;

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
                    "generatedcode.client",
                    "http://footballpool.dataaccess.eu/data/info.wso?WSDL"
                });

        System.out.println("Done!");
    }
}
