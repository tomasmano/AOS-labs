package edu.tomy.divisionsecuritydemo;

import javax.jws.WebService;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@WebService
public interface DivisionServiceIface {

    public int divide(int x, int y);
}
