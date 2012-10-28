/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tomy.cxfspringdemo.server;

import javax.jws.WebService;

/**
 *
 * @author tomy
 */
@WebService
public interface SumService {

    public int getSum(int i, int j);
}
