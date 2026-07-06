package class_13.decoratorDP.paymentEg;

public class OTPVerificationDecorator extends PaymentDecorator {
    public OTPVerificationDecorator(Payment payment) {
        super(payment);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Sending OTP...");
        System.out.println("OTP Verified Successfully.");
        super.pay(amount);
    }
}
