/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tomy.aoslab04;

import javax.jws.WebService;

/**
 *
 * @author tomy
 */
@WebService
public interface SumServiceIface {

    public int getSum(int i, int j);
}
