package edu.tomy.cxfspringdemo.server;

import javax.jws.WebService;

@WebService(endpointInterface = "edu.tomy.cxfspringdemo.server.HelloService")
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return String.format("Hello %s", name);
    }
    
}
