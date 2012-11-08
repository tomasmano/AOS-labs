package edu.tomy.divisionsecuritydemo;

import javax.jws.WebService;


/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@WebService(endpointInterface = "edu.tomy.divisionsecuritydemo.DivisionServiceIface")
public class DivisionService implements DivisionServiceIface{

    @Override
    public int divide(int x, int y) {
        return x/y;
    }

    
}
