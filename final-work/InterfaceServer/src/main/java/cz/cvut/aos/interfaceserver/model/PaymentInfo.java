package cz.cvut.aos.interfaceserver.model;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public class PaymentInfo {

    private Long payer;
    private Long payee;
    private String type;

    public PaymentInfo() {
    }

    public PaymentInfo(Long payer, Long payee, String type) {
        this.payer = payer;
        this.payee = payee;
        this.type = type;
    }

    public Long getPayer() {
        return payer;
    }

    public void setPayer(Long payer) {
        this.payer = payer;
    }

    public Long getPayee() {
        return payee;
    }

    public void setPayee(Long payee) {
        this.payee = payee;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "PaymentInfo{" + ", payer=" + payer + ", payee=" + payee + ", type=" + type + '}';
    }
    
}
