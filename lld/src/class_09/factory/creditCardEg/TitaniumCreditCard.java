package class_09.factory.creditCardEg;

public class TitaniumCreditCard implements CreditCard {
    @Override
    public String getCardType() {
        return CreditCardType.TitaniumCard.toString();
    }

    @Override
    public int getCreditLimit() {
        return 500000;
    }

    @Override
    public int getAnnualCharge() {
        return 500;
    }
}
