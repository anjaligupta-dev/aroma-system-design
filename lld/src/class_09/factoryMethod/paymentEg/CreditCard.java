package class_09.factoryMethod.paymentEg;

public class CreditCard implements Payment {
    @Override
    public void pay() {
        System.out.println("Paying by Credit Card");
    }
}
