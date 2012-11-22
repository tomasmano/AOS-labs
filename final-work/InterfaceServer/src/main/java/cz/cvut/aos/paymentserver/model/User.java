package cz.cvut.aos.paymentserver.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class User {
    private String firstName;
    private String LastName;

    public User() {
    }

    public User(String firstName, String LastName) {
        this.firstName = firstName;
        this.LastName = LastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    @Override
    public String toString() {
        return "User{" + "firstName=" + firstName + ", LastName=" + LastName + '}';
    }
    
}
