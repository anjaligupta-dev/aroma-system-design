package class_09.factoryMethod.paymentEg;

public class DebitCard implements Payment {
    @Override
    public void pay() {
        System.out.println("Paying by Debit Card");
    }
}
