package cz.cvut.aos.interfaceserver.service;

import cz.cvut.aos.interfaceserver.model.Account;
import cz.cvut.aos.interfaceserver.model.Payment;
import cz.cvut.aos.interfaceserver.service.exception.UnknownAccountException;
import javax.jws.WebService;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@WebService(targetNamespace="http://webservice.paymentserver.aos.cvut.cz/")
public interface PaymentService {

    public Payment payWithCreditCard(Long payer, Long payee, double amount) throws UnknownAccountException;

    public Payment payWithBankAccount(Long payer, Long payee, double amount) throws UnknownAccountException;
    
    public double getBalance(Long account) throws UnknownAccountException;
    
    public Account getAccountDetails(Long account) throws UnknownAccountException;
}
