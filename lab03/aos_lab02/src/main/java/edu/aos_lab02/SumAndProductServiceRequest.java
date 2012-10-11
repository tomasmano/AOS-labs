/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tomy.cvicenie02b;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author manotoma
 */
@XmlRootElement(name = "integersRequest")
public class SumAndProductServiceRequest {

    private int[] array;

    public SumAndProductServiceRequest() {
    }
    
    public SumAndProductServiceRequest(int... array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "SumAndProductServiceRequest{" + "array=" + array + '}';
    }
}
