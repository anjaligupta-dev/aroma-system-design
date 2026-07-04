package class_12.adapterDP.paymentEg;

public class StripeGateway implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Processing payment of $" + amount + " through Stripe.");
    }
}
