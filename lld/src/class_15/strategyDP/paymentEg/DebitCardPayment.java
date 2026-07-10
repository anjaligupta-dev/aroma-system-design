package class_15.strategyDP.paymentEg;

public class DebitCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Debit Card.");
    }
}
