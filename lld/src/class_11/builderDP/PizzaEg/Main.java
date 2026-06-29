package class_11.builderDP.PizzaEg;

public class Main {
    public static void main(String[] args) {
        PizzaOrder order1 =
                new PizzaOrder.PizzaOrderBuilder(
                        "Farmhouse",
                        PizzaSize.LARGE)
                        .crustType(CrustType.THIN_CRUST)
                        .extraCheese(true)
                        .extraSauce(true)
                        .oreganoSachets(3)
                        .chilliFlakesSachets(2)
                        .couponCode("SAVE200")
                        .giftWrap(true)
                        .specialInstructions("Ring the bell once.")
                        .build();

        System.out.println(order1);

        System.out.println("-----------------------------------------");

        PizzaOrder order2 =
                new PizzaOrder.PizzaOrderBuilder(
                        "Veggie Delight",
                        PizzaSize.MEDIUM)
                        .extraCheese(true)
                        .contactlessDelivery(true)
                        .specialInstructions("Leave at the doorstep.")
                        .build();

        System.out.println(order2);

        System.out.println("-----------------------------------------");

        PizzaOrder order3 =
                new PizzaOrder.PizzaOrderBuilder(
                        "Margherita",
                        PizzaSize.SMALL)
                        .build();

        System.out.println(order3);
    }
}


/* *

    Output :
        PizzaOrder
         pizzaName='Farmhouse',
         size=LARGE,
         crustType=THIN_CRUST,
         extraCheese=true,
         extraSauce=true,
         oreganoSachets=3,
         chilliFlakesSachets=2,
         couponCode='SAVE200',
         giftWrap=true,
         contactlessDelivery=false,
         specialInstructions='Ring the bell once.'
        -----------------------------------------
        PizzaOrder
         pizzaName='Veggie Delight',
         size=MEDIUM,
         crustType=REGULAR,
         extraCheese=true,
         extraSauce=false,
         oreganoSachets=1,
         chilliFlakesSachets=1,
         couponCode='',
         giftWrap=false,
         contactlessDelivery=true,
         specialInstructions='Leave at the doorstep.'
        -----------------------------------------
        PizzaOrder
         pizzaName='Margherita',
         size=SMALL,
         crustType=REGULAR,
         extraCheese=false,
         extraSauce=false,
         oreganoSachets=1,
         chilliFlakesSachets=1,
         couponCode='',
         giftWrap=false,
         contactlessDelivery=false,
         specialInstructions=''

* */