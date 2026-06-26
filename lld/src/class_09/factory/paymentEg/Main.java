package class_09.factory.paymentEg;

public class Main {
    public static void main(String[] args) {
        Payment payment1 = PaymentFactory.getPayment(PaymentType.DebitCard);
        payment1.pay(PaymentType.DebitCard);  // Output: Paying by Debit Card

        Payment payment2 = PaymentFactory.getPayment(PaymentType.CreditCard);
        payment2.pay(PaymentType.CreditCard);  // Output: Paying by Debit Card
    }
}
