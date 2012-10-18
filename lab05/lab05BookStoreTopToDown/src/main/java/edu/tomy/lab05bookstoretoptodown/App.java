package edu.tomy.lab05bookstoretoptodown;

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
                    "bookStore",
                    "/home/tomy/NetBeansProjects/AOS-labs/lab05BookStoreTopToDown/src/main/java/BookStore.wsdl"
                });
        System.out.println("Done!");
    }
}
