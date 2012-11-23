package cz.cvut.aos.interfaceserver.model;

import cz.cvut.aos.interfaceserver.model.adapter.TimestampAdapter;
import java.sql.Timestamp;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class Flight {

    private Long id;
    @XmlJavaTypeAdapter(TimestampAdapter.class)
    private Timestamp flightTime;
    private double price;
    private String source;
    private String target;
    private int capacity;

    public Flight() {
    }

    public Flight(Long id, Timestamp flightTime, double price, String source, String target, int capacity) {
        this.id = id;
        this.flightTime = flightTime;
        this.price = price;
        this.source = source;
        this.target = target;
        this.capacity = capacity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(Timestamp flightTime) {
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Flight{" + "id=" + id + ", flightTime=" + flightTime + ", price=" + price + ", source=" + source + ", target=" + target + ", capacity=" + capacity + '}';
    }
}
