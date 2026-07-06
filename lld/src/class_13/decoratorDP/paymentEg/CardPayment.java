package class_13.decoratorDP.paymentEg;

public class CardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Card");
    }
}