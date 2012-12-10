package cz.cvut.aos.paymentserver.service;

import cz.cvut.aos.paymentserver.model.Account;
import cz.cvut.aos.paymentserver.model.Payment;
import cz.cvut.aos.paymentserver.service.exception.UnknownAccountException;

/**
 * Application service interface.
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public interface PaymentService {

    /**
     * Triggers credit card transfer from payer to payee account.
     *
     * @param payer payer account code
     * @param payee payee account coud
     * @param amount payment amount
     * @return payment containg payer, payee and amount
     * @throws UnknownAccountException if payer's or payee's code doesn't match
     * any existing code.
     */
    public Payment payWithCreditCard(Long payer, Long payee, double amount) throws UnknownAccountException;

    /**
     * Triggers bank transfer from payer to payee account.
     *
     * @param payer payer account code
     * @param payee payee account coud
     * @param amount payment amount
     * @return payment containg payer, payee and amount
     * @throws UnknownAccountException if payer's or payee's code doesn't match
     * any existing code.
     */
    public Payment payWithBankAccount(Long payer, Long payee, double amount) throws UnknownAccountException;

    /**
     * Returns overall ballance for given account's code.
     *
     * @param account account's code
     * @return overall ballance
     * @throws UnknownAccountException if payer's or payee's code doesn't match
     * any existing code.
     */
    public double getBalance(Long account) throws UnknownAccountException;

    /**
     * Returns account's detail for given account's code.
     *
     * @param account account's code
     * @return account's detail
     * @throws UnknownAccountException if payer's or payee's code doesn't match
     * any existing code.
     */
    public Account getAccountDetails(Long account) throws UnknownAccountException;
}
