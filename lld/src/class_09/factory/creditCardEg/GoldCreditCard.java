package class_09.factory.creditCardEg;

public class GoldCreditCard implements CreditCard {
    @Override
    public String getCardType() {
        return CreditCardType.GoldCard.toString();
    }

    @Override
    public int getCreditLimit() {
        return 1500000;
    }

    @Override
    public int getAnnualCharge() {
        return 1500;
    }
}
