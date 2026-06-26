package class_09.factory.paymentEg;

public class CreditCard implements Payment {
    @Override
    public void pay(PaymentType type) {
        System.out.println("Paying by Credit Card");
    }
}
