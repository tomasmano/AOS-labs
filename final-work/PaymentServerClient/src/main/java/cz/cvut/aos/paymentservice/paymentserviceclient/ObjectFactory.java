
package cz.cvut.aos.paymentservice.paymentserviceclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cz.cvut.aos.paymentservice.paymentserviceclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PayWithBankAccount_QNAME = new QName("http://webservice.paymentserver.aos.cvut.cz/", "payWithBankAccount");
    private final static QName _UnknownAccountException_QNAME = new QName("http://webservice.paymentserver.aos.cvut.cz/", "UnknownAccountException");
    private final static QName _PayWithCreditCardResponse_QNAME = new QName("http://webservice.paymentserver.aos.cvut.cz/", "payWithCreditCardResponse");
    private final static QName _PayWithBankAccountResponse_QNAME = new QName("http://webservice.paymentserver.aos.cvut.cz/", "payWithBankAccountResponse");
    private final static QName _PayWithCreditCard_QNAME = new QName("http://webservice.paymentserver.aos.cvut.cz/", "payWithCreditCard");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cz.cvut.aos.paymentservice.paymentserviceclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PayWithCreditCard }
     * 
     */
    public PayWithCreditCard createPayWithCreditCard() {
        return new PayWithCreditCard();
    }

    /**
     * Create an instance of {@link PayWithBankAccountResponse }
     * 
     */
    public PayWithBankAccountResponse createPayWithBankAccountResponse() {
        return new PayWithBankAccountResponse();
    }

    /**
     * Create an instance of {@link PayWithCreditCardResponse }
     * 
     */
    public PayWithCreditCardResponse createPayWithCreditCardResponse() {
        return new PayWithCreditCardResponse();
    }

    /**
     * Create an instance of {@link UnknownAccountException }
     * 
     */
    public UnknownAccountException createUnknownAccountException() {
        return new UnknownAccountException();
    }

    /**
     * Create an instance of {@link PayWithBankAccount }
     * 
     */
    public PayWithBankAccount createPayWithBankAccount() {
        return new PayWithBankAccount();
    }

    /**
     * Create an instance of {@link Payment }
     * 
     */
    public Payment createPayment() {
        return new Payment();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayWithBankAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.paymentserver.aos.cvut.cz/", name = "payWithBankAccount")
    public JAXBElement<PayWithBankAccount> createPayWithBankAccount(PayWithBankAccount value) {
        return new JAXBElement<PayWithBankAccount>(_PayWithBankAccount_QNAME, PayWithBankAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownAccountException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.paymentserver.aos.cvut.cz/", name = "UnknownAccountException")
    public JAXBElement<UnknownAccountException> createUnknownAccountException(UnknownAccountException value) {
        return new JAXBElement<UnknownAccountException>(_UnknownAccountException_QNAME, UnknownAccountException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayWithCreditCardResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.paymentserver.aos.cvut.cz/", name = "payWithCreditCardResponse")
    public JAXBElement<PayWithCreditCardResponse> createPayWithCreditCardResponse(PayWithCreditCardResponse value) {
        return new JAXBElement<PayWithCreditCardResponse>(_PayWithCreditCardResponse_QNAME, PayWithCreditCardResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayWithBankAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.paymentserver.aos.cvut.cz/", name = "payWithBankAccountResponse")
    public JAXBElement<PayWithBankAccountResponse> createPayWithBankAccountResponse(PayWithBankAccountResponse value) {
        return new JAXBElement<PayWithBankAccountResponse>(_PayWithBankAccountResponse_QNAME, PayWithBankAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayWithCreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.paymentserver.aos.cvut.cz/", name = "payWithCreditCard")
    public JAXBElement<PayWithCreditCard> createPayWithCreditCard(PayWithCreditCard value) {
        return new JAXBElement<PayWithCreditCard>(_PayWithCreditCard_QNAME, PayWithCreditCard.class, null, value);
    }

}
