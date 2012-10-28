package edu.tomy.cxfspringdemo.client;

import edu.tomy.cxfspringdemo.server.HelloService;
import edu.tomy.cxfspringdemo.server.SumService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public class HelloClient {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"client-beans.xml"});
        HelloService service = (HelloService) context.getBean("helloClient");
        String output = service.sayHello("tomy");
        SumService sumService = (SumService) context.getBean("sumClient");
        int res = sumService.getSum(5, 9);
        System.out.println(output+ ", result of: " + res);
    }
}
