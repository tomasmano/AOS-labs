package cz.cvut.aos.bookingserver.model;

import cz.cvut.aos.bookingserver.model.common.Persistable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@Entity
public class Flight implements Persistable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Temporal(TemporalType.TIME)
    private Date flightTime;
    private double price;
    private String source;
    private String target;
    @XmlTransient
    @OneToMany(mappedBy = "flight")
    private List<AirTicket> airTickets;
    private int capacity;

    public Flight() {
    }

    public Flight(Date flightTime, double price, String source, String target, int capacity) {
        this.flightTime = flightTime;
        this.price = price;
        this.source = source;
        this.target = target;
        this.capacity = capacity;
    }

    /**
     * Registers given airticket to this flight.
     * 
     * @param airTicket airticket to be registered
     */
    protected void registerAirTicker(AirTicket airTicket) {
        if (airTickets == null) {
            airTickets = new ArrayList<AirTicket>();
        }
        if (!airTickets.contains(airTicket)) {
            airTickets.add(airTicket);
            capacity--;
        }
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<AirTicket> getAirTickets() {
        return airTickets;
    }

    public void setAirTickets(List<AirTicket> airTickets) {
        this.airTickets = airTickets;
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
