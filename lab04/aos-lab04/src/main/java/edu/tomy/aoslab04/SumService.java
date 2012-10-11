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
@WebService(endpointInterface = "edu.tomy.aoslab04.SumServiceIface")
public class SumService implements SumServiceIface {

    @Override
    public int getSum(int i, int j) {
        return i + j;
    }
}
