package edu.tomy.extendingdemo;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public class Sub extends Super{

    public Sub() {
        super();
        System.out.println("sub called");
    }

    public Sub(String sub){
        super(sub);
        System.out.println("sub called");
    }
}
