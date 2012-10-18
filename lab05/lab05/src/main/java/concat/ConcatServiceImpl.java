package concat;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
class ConcatServiceImpl implements ConcatService{

    public ConcatServiceImpl() {
    }

    public String concatOperation(String string1, String string2) {
        return string1.concat(string2);
    }
    
}
