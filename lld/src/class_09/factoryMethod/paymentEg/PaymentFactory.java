package class_09.factoryMethod.paymentEg;

public abstract class PaymentFactory {
    // Factory Method
    public abstract Payment createPayment();

    // Business logic - Common for all child classes
    public void processPayment(){
        Payment payment = createPayment(); // return new CreditCard();
        payment.pay();
    }
}
