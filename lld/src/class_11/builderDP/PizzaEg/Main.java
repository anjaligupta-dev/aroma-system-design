package class_11.builderDP.PizzaEg;

public class Main {
    public static void main(String[] args) {
        PizzaOrder order1 =
                new PizzaOrder.Builder(
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
                new PizzaOrder.Builder(
                        "Veggie Delight",
                        PizzaSize.MEDIUM)
                        .extraCheese(true)
                        .contactlessDelivery(true)
                        .specialInstructions("Leave at the doorstep.")
                        .build();

        System.out.println(order2);
        System.out.println("-----------------------------------------");


        PizzaOrder order3 =
                new PizzaOrder.Builder(
                        "Margherita",
                        PizzaSize.SMALL)
                        .build();

        System.out.println(order3);
        System.out.println("-----------------------------------------");


        // Invalid Order - Demonstrating Cross-field Validation
        try {
            PizzaOrder order4 =
                    new PizzaOrder.Builder(
                            "Cheese Burst",
                            PizzaSize.SMALL)
                            .crustType(CrustType.CHEESE_BURST)
                            .extraCheese(true)
                            .build();

            System.out.println(order4);
        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }
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
        -----------------------------------------
        Exception : Extra cheese is already included in Cheese Burst pizzas.

* */
