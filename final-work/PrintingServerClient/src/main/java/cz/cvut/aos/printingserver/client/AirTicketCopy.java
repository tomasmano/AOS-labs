
package cz.cvut.aos.printingserver.client;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for airTicketCopy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="airTicketCopy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airTicketData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "airTicketCopy", propOrder = {
    "airTicketData"
})
public class AirTicketCopy {

    @XmlElement(required = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler airTicketData;

    public AirTicketCopy() {
    }

    public AirTicketCopy(DataHandler airTicketData) {
        this.airTicketData = airTicketData;
    }
    
    /**
     * Gets the value of the airTicketData property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getAirTicketData() {
        return airTicketData;
    }

    /**
     * Sets the value of the airTicketData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setAirTicketData(DataHandler value) {
        this.airTicketData = value;
    }

    @Override
    public String toString() {
        return "AirTicketCopy{" + "airTicketData=" + airTicketData + '}';
    }
}
