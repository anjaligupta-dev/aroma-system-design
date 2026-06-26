package class_09.factory.creditCardEg;

public class CreditCardFactory {
    public static CreditCard getCreditCard(CreditCardType type) {
        switch (type) {
            case PlatinumCard:
                return new PlatinumCreditCard();
            case TitaniumCard:
                return new TitaniumCreditCard();
            case GoldCard:
                return new GoldCreditCard();
            default:
                throw new IllegalArgumentException("Invalid credit card type: " + type);
        }
    }
}
