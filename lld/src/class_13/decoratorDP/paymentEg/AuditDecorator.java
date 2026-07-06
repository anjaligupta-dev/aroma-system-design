package class_13.decoratorDP.paymentEg;

import java.time.LocalDateTime;

public class AuditDecorator  extends PaymentDecorator {
    public AuditDecorator(Payment payment) {
        super(payment);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Audit Log:");
        System.out.println("Time : " + LocalDateTime.now());
        System.out.println("Amount : ₹" + amount);
        super.pay(amount);
        System.out.println("Transaction recorded successfully.");
    }
}
