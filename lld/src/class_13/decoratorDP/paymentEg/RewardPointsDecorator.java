package class_13.decoratorDP.paymentEg;

public class RewardPointsDecorator extends PaymentDecorator {
    public RewardPointsDecorator(Payment payment) {
        super(payment);
    }

    @Override
    public void pay(double amount) {
        super.pay(amount);
        int points = (int) amount / 100;
        System.out.println("Reward Points Earned : " + points);
    }
}
