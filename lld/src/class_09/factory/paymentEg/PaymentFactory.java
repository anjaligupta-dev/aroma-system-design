package class_09.factory.paymentEg;

public class PaymentFactory {
    public static Payment getPayment(PaymentType paymentType) {
        switch (paymentType) {
            case CreditCard:
                return new CreditCard();
            case DebitCard:
                return new DebitCard();
            default:
                throw new IllegalArgumentException("Invalid payment type: " + paymentType);
        }
    }
}
