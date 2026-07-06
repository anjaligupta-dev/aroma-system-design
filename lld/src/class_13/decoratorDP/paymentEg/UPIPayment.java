package class_13.decoratorDP.paymentEg;

public class UPIPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}
