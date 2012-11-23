package cz.cvut.aos.paymentserver.service;

import cz.cvut.aos.paymentserver.model.Account;
import cz.cvut.aos.paymentserver.model.Payment;
import cz.cvut.aos.paymentserver.service.exception.UnknownAccountException;
import java.util.ArrayList;
import java.util.Collection;
import org.springframework.stereotype.Service;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
@Service("paymentServiceBean")
public class PaymentServiceImpl implements PaymentService {

    private static final Collection<Account> accountDB = new ArrayList<Account>();

    static {
        accountDB.add(new Account(123L, 9999L, "tomy", "pass1", 10000));
        accountDB.add(new Account(456L, 8888L, "dasa", "pass2", 15000));
        accountDB.add(new Account(789L, 7777L, "miso", "pass3", 25000));
    }

    @Override
    public Payment payWithCreditCard(Long payer, Long payee, double amount) throws UnknownAccountException {
        return transferMoney(findByCreditNumber(payer), findByCreditNumber(payee), amount);
    }

    @Override
    public Payment payWithBankAccount(Long payer, Long payee, double amount) throws UnknownAccountException {
        return transferMoney(findByAccountNumber(payer), findByAccountNumber(payee), amount);
    }

    @Override
    public double getBalance(Long account) throws UnknownAccountException {
        return findByAccountNumber(account).getBalance();
    }

    @Override
    public Account getAccountDetails(Long account) throws UnknownAccountException {
        return findByAccountNumber(account);
    }

    private Payment transferMoney(Account payer, Account payee, double amount) {
        payer.chargeMoney(amount);
        payee.insertMoney(amount);
        return new Payment(amount, payer, payee);
    }
    
    private Account findByAccountNumber(Long identifier) throws UnknownAccountException {
        for (Account account : accountDB) {
            if (account.getAccountNumber().equals(identifier)) {
                return account;
            }
        }
        throw new UnknownAccountException("Account with number [" + identifier + "] doesn't exists.");
    }

    private Account findByCreditNumber(Long identifier) throws UnknownAccountException {
        for (Account account : accountDB) {
            if (account.getCreditCardNumber().equals(identifier)) {
                return account;
            }
        }
        throw new UnknownAccountException("Account with number [" + identifier + "] doesn't exists.");
    }
}
