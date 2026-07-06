package class_13.decoratorDP.paymentEg;

public class CashbackDecorator extends PaymentDecorator {
    public CashbackDecorator(Payment payment) {
        super(payment);
    }

    @Override
    public void pay(double amount) {
        super.pay(amount);
        double cashback = amount * 0.05;
        System.out.println("Cashback Earned : ₹" + cashback);
    }
}
