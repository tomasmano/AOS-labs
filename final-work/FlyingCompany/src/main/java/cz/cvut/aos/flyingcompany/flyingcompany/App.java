package cz.cvut.aos.flyingcompany.flyingcompany;

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
                    "cz.cvut.aos.flyingcompany.generatedcode.client",
                    "http://localhost:8081/InterfaceServer/InterfaceService?wsdl"
                });

        System.out.println("Done!");
    }
}
