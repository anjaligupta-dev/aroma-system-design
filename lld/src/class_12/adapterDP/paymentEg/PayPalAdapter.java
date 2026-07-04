package class_12.adapterDP.paymentEg;

// Adapter for PayPal SDK
public class PayPalAdapter implements PaymentGateway {
    private final PayPalSDK payPal;

    public PayPalAdapter(PayPalSDK payPal) {
        this.payPal = payPal;
    }

    @Override
    public void pay(double amount) {
        // Calling PayPal method to pay money
        payPal.makePayment(amount);
    }
}
