package class_09.factory.creditCardEg;

public class Main {
    public static void main(String[] args) {
        for (CreditCardType type : CreditCardType.values()) {
            printCardDetails(type);
            System.out.println();
        }
    }

    private static void printCardDetails(CreditCardType type) {
        CreditCard card = CreditCardFactory.getCreditCard(type);
        System.out.println("Card Type      : " + card.getCardType());
        System.out.println("Credit Limit   : " + card.getCreditLimit());
        System.out.println("Annual Charge  : " + card.getAnnualCharge());
    }
}


/* *
    Output :
        Card Type      : PlatinumCard
        Credit Limit   : 100000
        Annual Charge  : 100

        Card Type      : TitaniumCard
        Credit Limit   : 500000
        Annual Charge  : 500

        Card Type      : GoldCard
        Credit Limit   : 1500000
        Annual Charge  : 1500
* */