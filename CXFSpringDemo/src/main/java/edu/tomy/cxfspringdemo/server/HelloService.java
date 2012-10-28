package edu.tomy.cxfspringdemo.server;

import javax.jws.WebService;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@WebService
public interface HelloService {

    public String sayHello (String name);
}
