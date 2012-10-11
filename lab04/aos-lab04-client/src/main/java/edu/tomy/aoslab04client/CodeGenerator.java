/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tomy.aoslab04client;

/**
 *
 * @author tomy
 */
import org.apache.cxf.tools.wsdlto.WSDLToJava;

public class CodeGenerator {

    public static void main(String[] args) {
        WSDLToJava.main(new String[]{
                    "-client",
                    "-d",
                    "src/main/java",
                    "http://localhost:8080/aos-lab04/SumService?wsdl"
                });
        System.out.println("Done!");
    }
}