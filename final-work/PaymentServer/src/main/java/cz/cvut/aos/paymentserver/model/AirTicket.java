package cz.cvut.aos.paymentserver.model;

import cz.cvut.aos.paymentserver.model.common.Persistable;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@Entity
public class AirTicket implements Persistable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private int seatNumber;
    @ManyToOne
    private Flight flight;

    public AirTicket() {
    }

    public AirTicket(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
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
        flight.registerAirTicker(this);// solution to common problem of object corruption, when one side (poject) of the relationship is not updated after updating the other side (app)
    }

    @Override
    public String toString() {
        return "AirTicket{" + "id=" + id + ", seatNumber=" + seatNumber + ", flight=" + flight + '}';
    }
    
}
