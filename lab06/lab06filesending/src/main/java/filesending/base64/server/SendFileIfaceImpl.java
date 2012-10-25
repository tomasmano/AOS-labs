package filesending.base64.server;


/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
class SendFileIfaceImpl implements SendFileIface{

    public SendFileIfaceImpl() {
    }
    
    public void sendFile(byte[] arg0) {
        System.out.println("Operation succesfull. Accepted array with length: "+arg0.length);
    }
    
}
