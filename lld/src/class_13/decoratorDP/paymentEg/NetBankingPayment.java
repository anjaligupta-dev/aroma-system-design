package class_13.decoratorDP.paymentEg;

public class NetBankingPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Net Banking");
    }
}
