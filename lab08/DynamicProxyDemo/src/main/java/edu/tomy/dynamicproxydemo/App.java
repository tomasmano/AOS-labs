package edu.tomy.dynamicproxydemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        GoodBye origin = new GoodByeImpl();
//        origin.sayGoodbye("Tomy");
        
        GoodBye g = (GoodBye) GoodbyeProxy.getProxyInstance(origin);
        String s1 = g.sayGoodbye("Tomy");
        String s2 = g.sayRespect();
        String s3 = g.sayHello("Deges");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
