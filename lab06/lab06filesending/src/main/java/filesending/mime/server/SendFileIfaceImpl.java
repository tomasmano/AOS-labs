package filesending.mime.server;

import java.io.FileOutputStream;
import java.io.IOException;
import javax.activation.DataHandler;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
class SendFileIfaceImpl implements SendFileIface {

    public SendFileIfaceImpl() {
    }

    public void sendFile(DataHandler arg0) {
        try {
            FileOutputStream out = new FileOutputStream("somefile.dat");
            arg0.writeTo(out);
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
