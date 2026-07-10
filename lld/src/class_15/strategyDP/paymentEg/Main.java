package class_15.strategyDP.paymentEg;

public class Main {
    public static void main(String[] args) {
        CheckoutService checkout = new CheckoutService(new UpiPayment());
        checkout.checkout(1200);
        checkout.setPaymentStrategy(new CreditCardPayment());
        checkout.checkout(2500);
        checkout.setPaymentStrategy(new WalletPayment());
        checkout.checkout(800);
    }
}


/* *
    Output :
        Paid ₹1200.0 using UPI.
        Paid ₹2500.0 using Credit Card.
        Paid ₹800.0 using Wallet.
* */
