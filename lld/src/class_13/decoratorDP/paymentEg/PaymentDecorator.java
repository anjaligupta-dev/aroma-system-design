package class_13.decoratorDP.paymentEg;

public abstract class PaymentDecorator implements Payment {
    protected final Payment payment;

    public PaymentDecorator(Payment payment) {
        this.payment = payment;
    }

    @Override
    public void pay(double amount) {
        payment.pay(amount);
    }
}
