package cz.cvut.aos.interfaceserver.model;

import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public class AirTicket {


    private Long id;
    private int seatNumber;

    private Flight flight;
    
    @XmlTransient
    private Long ownerId;

    public AirTicket() {
    }

    public AirTicket(int seatNumber) {
        this.seatNumber = seatNumber;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public String toString() {
        return "AirTicket{" + "id=" + id + ", seatNumber=" + seatNumber + ", flight=" + flight + '}';
    }
    
}
