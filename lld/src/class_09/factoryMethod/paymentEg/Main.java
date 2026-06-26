package class_09.factoryMethod.paymentEg;

public class Main {
    public static void main(String[] args) {
        PaymentFactory payment1 = new DebitCardFactory();
        payment1.processPayment();  // Output: Paying by Debit Card

        PaymentFactory payment2 = new CreditCardFactory();
        payment2.processPayment();  // Output: Paying by Credit Card
    }
}
