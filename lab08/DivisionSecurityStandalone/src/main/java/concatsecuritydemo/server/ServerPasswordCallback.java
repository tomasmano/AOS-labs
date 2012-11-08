package concatsecuritydemo.server;

import java.io.IOException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.apache.ws.security.WSPasswordCallback;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public class ServerPasswordCallback {

    public void handle(Callback[] callbacks) throws IOException,
            UnsupportedCallbackException {
        for (int i = 0; i < callbacks.length; i++) {
            WSPasswordCallback pwcb = (WSPasswordCallback) callbacks[i];
            String id = pwcb.getIdentifier();
            if (id.equals("c1")) {
                pwcb.setPassword("nbu123");
            }
        }
    }
}
