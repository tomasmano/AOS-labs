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
@WebService(endpointInterface = "edu.tomy.cxfspringdemo.server.SumService")
public class SumServiceImpl implements SumService {

    @Override
    public int getSum(int i, int j) {
        return i + j;
    }
}
