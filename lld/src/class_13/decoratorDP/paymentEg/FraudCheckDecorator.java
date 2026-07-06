package class_13.decoratorDP.paymentEg;

public class FraudCheckDecorator extends PaymentDecorator {
    public FraudCheckDecorator(Payment payment) {
        super(payment);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Checking for fraudulent transaction...");
        super.pay(amount);
        System.out.println("Fraud check passed.");
    }
}
