package cz.cvut.aos.interfaceserver.webservice;

import cz.cvut.aos.interfaceserver.model.Payment;
import cz.cvut.aos.interfaceserver.service.exception.UnknownAccountException;
import javax.jws.WebService;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@WebService
public interface PaymentWebService {

    public Payment payWithCreditCard(Long payer, Long payee, double amount) throws UnknownAccountException;

    public Payment payWithBankAccount(Long payer, Long payee, double amount) throws UnknownAccountException;
    
    public double getBalance(Long account) throws UnknownAccountException;
}
