package class_09.factoryMethod.paymentEg;

public class DebitCardFactory extends PaymentFactory {
    @Override
    public Payment createPayment() {
        return new DebitCard();
    }
}
