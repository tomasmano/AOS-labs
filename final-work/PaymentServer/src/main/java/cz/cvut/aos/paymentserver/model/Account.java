package cz.cvut.aos.paymentserver.model;

/**
 * Represents an account in the system.
 * 
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public class Account {

    Long accountNumber;
    Long creditCardNumber;
    String name;
    String password;
    double balance;

    public Account() {
    }

    public Account(Long accountNumber, Long creditCardNumber, String name, String password, double balance) {
        this.accountNumber = accountNumber;
        this.creditCardNumber = creditCardNumber;
        this.name = name;
        this.password = password;
        this.balance = balance;
    }

    public void insertMoney(double amount) {
        this.balance = balance + amount;
    }

    public void chargeMoney(double amount) {
        this.balance = balance - amount;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(Long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "accountNumber=" + accountNumber + ", creditCardNumber=" + creditCardNumber + ", name=" + name + ", password=" + password + ", balance=" + balance + '}';
    }
}
