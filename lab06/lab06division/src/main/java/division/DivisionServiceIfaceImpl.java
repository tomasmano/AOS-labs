package division;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
class DivisionServiceIfaceImpl implements DivisionServiceIface{

    public DivisionServiceIfaceImpl() {
    }
    
    public float divide(float arg0, float arg1) throws DivisionByZeroException_Exception {
        if (arg1==0) {
            throw new DivisionByZeroException_Exception("Operation failed. Cannot divide by zero.");
        }
        return arg0/arg1;
    }
    
}
