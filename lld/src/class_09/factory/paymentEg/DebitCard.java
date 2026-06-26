package class_09.factory.paymentEg;

public class DebitCard implements Payment {
    @Override
    public void pay(PaymentType type) {
        System.out.println("Paying by Debit Card");
    }
}
