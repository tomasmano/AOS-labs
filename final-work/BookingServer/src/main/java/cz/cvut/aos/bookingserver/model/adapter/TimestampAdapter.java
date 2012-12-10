package cz.cvut.aos.bookingserver.model.adapter;

import java.sql.Timestamp;
import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * TimeStamp apdapter to string.
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