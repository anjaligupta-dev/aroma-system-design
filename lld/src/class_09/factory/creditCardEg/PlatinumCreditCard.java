package class_09.factory.creditCardEg;

public class PlatinumCreditCard implements CreditCard {
    @Override
    public String getCardType() {
        return CreditCardType.PlatinumCard.toString();
    }

    @Override
    public int getCreditLimit() {
        return 100000;
    }

    @Override
    public int getAnnualCharge() {
        return 100;
    }
}
