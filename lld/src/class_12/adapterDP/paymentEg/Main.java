package class_12.adapterDP.paymentEg;

public class Main {
    public static void main(String[] args) {
        PaymentGateway stripe = new StripeGateway();
        stripe.pay(100.0);  // Output : Processing payment of $100.0 through Stripe.

        PaymentGateway payPal = new PayPalAdapter(new PayPalSDK());
        payPal.pay(200.0);  // Output : Processing payment of $200.0 through PayPal.

        PaymentGateway razorPay = new  RazorPayAdapter(new RazorPaySDK());
        razorPay.pay(300.0);    // Output : Processing payment of $300.0 through RazorPay.
    }
}
