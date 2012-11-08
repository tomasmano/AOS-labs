package concatsecuritydemo.server;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
class ConcatServiceImpl implements ConcatService{

    public ConcatServiceImpl() {
    }

    public ConcatResponse concatOperation(Concat parameters) {
        return new ConcatResponse(parameters.getString1() + parameters.getString2());
    }
    
    
}
