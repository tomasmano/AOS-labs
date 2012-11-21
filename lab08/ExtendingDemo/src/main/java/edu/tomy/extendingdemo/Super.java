package edu.tomy.extendingdemo;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public abstract class Super {

    private String superString;
    
    public Super() {
        this(null);
        System.out.println("super called");
    }

    public Super(String superString) {
        this.superString = superString;
        System.out.println("super called");
    }

    public String getSuperString() {
        return superString;
    }

    public void setSuperString(String superString) {
        this.superString = superString;
    }
    
}
