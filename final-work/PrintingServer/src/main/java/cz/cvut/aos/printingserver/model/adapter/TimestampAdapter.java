package cz.cvut.aos.printingserver.model.adapter;

import java.sql.Timestamp;
import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public class TimestampAdapter extends XmlAdapter<String, Timestamp> {

    @Override
    public String marshal(Timestamp timestamp) throws Exception {
        return timestamp.toString();
    }

    @Override
    public Timestamp unmarshal(String string) throws Exception {
        return Timestamp.valueOf(string);
    }
}