package class_09.factoryMethod.paymentEg;

public class CreditCardFactory extends PaymentFactory {
    @Override
    public Payment createPayment() {
        return new CreditCard();
    }
}
