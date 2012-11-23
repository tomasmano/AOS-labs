package cz.cvut.aos.interfaceserver.model;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class AirTicketCopy {

    @XmlElement(required = true)
    @XmlMimeType("application/octet-stream")
    private DataHandler airTicketData;

    public AirTicketCopy() {
    }

    public AirTicketCopy(DataHandler airTicketData) {
        this.airTicketData = airTicketData;
    }

    public DataHandler getAirTicketData() {
        return airTicketData;
    }

    public void setAirTicketData(DataHandler airTicketData) {
        this.airTicketData = airTicketData;
    }

    @Override
    public String toString() {
        return "AirTicketCopy{" + "airTicketData=" + airTicketData + '}';
    }
    
}
