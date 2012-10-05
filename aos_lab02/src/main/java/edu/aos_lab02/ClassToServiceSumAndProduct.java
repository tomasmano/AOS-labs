/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tomy.cvicenie02b;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author manotoma
 */

@XmlRootElement(name="integersResponse")
public class ClassToServiceSumAndProduct {
    private int product;
    private int sum;

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "ClassToServiceSumAndProduct{" + "product=" + product + ", sum=" + sum + '}';
    }
}
