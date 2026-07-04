package class_12.adapterDP.paymentEg;

// Adapter for RazorPay SDK
public class RazorPayAdapter implements PaymentGateway {
    private final RazorPaySDK razorPay;

    public RazorPayAdapter(RazorPaySDK razorPay) {
        this.razorPay = razorPay;
    }

    @Override
    public void pay(double amount) {
        // Calling RazorPay method to pay money
        razorPay.processTransaction(amount);
    }
}
