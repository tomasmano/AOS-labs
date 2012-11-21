package edu.tomy.dynamicproxydemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public class GoodbyeProxy implements InvocationHandler {

    private Object obj;

    private GoodbyeProxy(Object obj) {
        this.obj = obj;
    }

    public static Object getProxyInstance(Object o) {
        return Proxy.newProxyInstance(
                o.getClass().getClassLoader(), 
                o.getClass().getInterfaces(), 
                new GoodbyeProxy(o));
    }

    public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
        Object result;
        try {
            System.out.println("before method " + m.getName());
            System.out.println("param arg: "+Arrays.toString(args));
            if (args!=null) {
                args[0]= "Mr. "+args[0];
            }
            result = m.invoke(obj, args);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (Exception e) {
            throw new RuntimeException("unexpected invocation exception: "
                    + e.getMessage());
        } finally {
            System.out.println("after method " + m.getName());
        }
        return result;
    }
}
