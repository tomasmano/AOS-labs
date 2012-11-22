package cz.cvut.aos.paymentserver.model;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class Flight {

    private Date flightTime;
    private double price;
    private String source;
    private String target;

    public Flight() {
    }

    public Flight(Date flightTime, double price, String source, String target) {
        this.flightTime = flightTime;
        this.price = price;
        this.source = source;
        this.target = target;
    }

    public Date getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(Date flightTime) {
        this.flightTime = flightTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return "Flight{" + "flightTime=" + flightTime + ", price=" + price + ", source=" + source + ", target=" + target + '}';
    }
    
    
}
