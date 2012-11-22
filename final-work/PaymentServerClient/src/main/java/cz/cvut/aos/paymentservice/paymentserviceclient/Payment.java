
package cz.cvut.aos.paymentservice.paymentserviceclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="payee" type="{http://webservice.paymentserver.aos.cvut.cz/}account" minOccurs="0"/>
 *         &lt;element name="payer" type="{http://webservice.paymentserver.aos.cvut.cz/}account" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payment", propOrder = {
    "amount",
    "payee",
    "payer"
})
public class Payment {

    protected double amount;
    protected Account payee;
    protected Account payer;

    public Payment() {
    }

    public Payment(double amount, Account payee, Account payer) {
        this.amount = amount;
        this.payee = payee;
        this.payer = payer;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the payee property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getPayee() {
        return payee;
    }

    /**
     * Sets the value of the payee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setPayee(Account value) {
        this.payee = value;
    }

    /**
     * Gets the value of the payer property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setPayer(Account value) {
        this.payer = value;
    }

    @Override
    public String toString() {
        return "Payment{" + "amount=" + amount + ", payee=" + payee + ", payer=" + payer + '}';
    }
    
}
