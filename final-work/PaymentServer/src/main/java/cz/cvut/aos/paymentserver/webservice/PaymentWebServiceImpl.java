package cz.cvut.aos.paymentserver.webservice;

import cz.cvut.aos.paymentserver.model.Account;
import cz.cvut.aos.paymentserver.model.Payment;
import cz.cvut.aos.paymentserver.service.PaymentService;
import cz.cvut.aos.paymentserver.service.exception.UnknownAccountException;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@Service("paymentWebServiceBean")
@WebService(endpointInterface = "cz.cvut.aos.paymentserver.webservice.PaymentWebService")
public class PaymentWebServiceImpl implements PaymentWebService {

    @Autowired
    @Qualifier("paymentServiceBean")
    private PaymentService paymentService;
    
    @Override
    public Payment payWithCreditCard(Long payer, Long payee, double amount) throws UnknownAccountException {
        return paymentService.payWithCreditCard(payer, payee, amount);
    }

    @Override
    public Payment payWithBankAccount(Long payer, Long payee, double amount) throws UnknownAccountException {
        return paymentService.payWithBankAccount(payer, payee, amount);
    }

    @Override
    public double getBalance(Long account) throws UnknownAccountException {
        return paymentService.getBalance(account);
    }

    @Override
    public Account getAccountDetails(Long account) throws UnknownAccountException {
        return paymentService.getAccountDetails(account);
    }

    public PaymentService getPaymentService() {
        return paymentService;
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    
}
