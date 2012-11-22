package cz.cvut.aos.paymentserver.service;

import cz.cvut.aos.paymentserver.model.Payment;
import cz.cvut.aos.paymentserver.service.exception.UnknownAccountException;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public interface PaymentService {

    public Payment payWithCreditCard(Long payer, Long payee, double amount) throws UnknownAccountException;

    public Payment payWithBankAccount(Long payer, Long payee, double amount) throws UnknownAccountException;
    
    public double getBalance(Long account) throws UnknownAccountException;
}
