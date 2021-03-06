
package cz.cvut.aos.paymentservice.paymentserviceclient;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.3.1
 * Thu Nov 22 15:23:18 CET 2012
 * Generated source version: 2.3.1
 * 
 */

public final class PaymentWebService_PaymentWebServiceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://webservice.paymentserver.aos.cvut.cz/", "PaymentWebServiceImplService");

    private PaymentWebService_PaymentWebServiceImplPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = PaymentWebServiceImplService.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        PaymentWebServiceImplService ss = new PaymentWebServiceImplService(wsdlURL, SERVICE_NAME);
        PaymentWebService port = ss.getPaymentWebServiceImplPort();  
        
        {
        System.out.println("Invoking payWithBankAccount...");
        java.lang.Long bankAcc1 = 123L;
        java.lang.Long bankAcc2 = 456L;
        double amount = 10;
        try {
            cz.cvut.aos.paymentservice.paymentserviceclient.Payment payment = port.payWithBankAccount(bankAcc1, bankAcc2, amount);
            System.out.println("payWithBankAccount.result=" + payment);

        } catch (UnknownAccountException_Exception e) { 
            System.out.println("Expected exception: UnknownAccountException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking payWithCreditCard...");
        java.lang.Long _payWithCreditCard_arg0 = 8888L;
        java.lang.Long _payWithCreditCard_arg1 = 7777L;
        double _payWithCreditCard_arg2 = 0;
        try {
            cz.cvut.aos.paymentservice.paymentserviceclient.Payment _payWithCreditCard__return = port.payWithCreditCard(_payWithCreditCard_arg0, _payWithCreditCard_arg1, _payWithCreditCard_arg2);
            System.out.println("payWithCreditCard.result=" + _payWithCreditCard__return);

        } catch (UnknownAccountException_Exception e) { 
            System.out.println("Expected exception: UnknownAccountException has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
