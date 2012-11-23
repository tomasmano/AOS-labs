package cz.cvut.aos.interfaceserver.model;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public class Payment {

    private double amount;
    private Account payer;
    private Account payee;

    public Payment() {
    }

    public Payment(double amount, Account payer, Account payee) {
        this.amount = amount;
        this.payer = payer;
        this.payee = payee;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Account getPayer() {
        return payer;
    }

    public void setPayer(Account payer) {
        this.payer = payer;
    }

    public Account getPayee() {
        return payee;
    }

    public void setPayee(Account payee) {
        this.payee = payee;
    }

    @Override
    public String toString() {
        return "Payment{" + "amount=" + amount + ", payer=" + payer + ", payee=" + payee + '}';
    }
}
