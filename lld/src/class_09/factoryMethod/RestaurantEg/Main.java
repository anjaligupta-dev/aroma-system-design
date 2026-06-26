package class_09.factoryMethod.RestaurantEg;

public class Main {
    public static void main(String[] args) {
        KitchenService italian = new ItalianKitchen();
        italian.processOrder();

        KitchenService chinese = new ChineseKitchen();
        chinese.processOrder();

        KitchenService mexican = new MexicanKitchen();
        mexican.processOrder();
    }
}


/* *
    Output :
        Customer placed an order.
        Selected Food : Italian Pizza
        Estimated Time : 20 minutes
        Preparing pizza dough, cheese and toppings.
        Baking pizza in oven.
        Packing pizza in pizza box.
        Generating bill for Italian Pizza
        Order Ready!
        -----------------------------------
        Customer placed an order.
        Selected Food : Chinese Noodles
        Estimated Time : 15 minutes
        Chopping vegetables and boiling noodles.
        Stir frying noodles.
        Packing noodles in takeaway box.
        Generating bill for Chinese Noodles
        Order Ready!
        -----------------------------------
        Customer placed an order.
        Selected Food : Mexican Tacos
        Estimated Time : 18 minutes
        Preparing taco shells and fillings.
        Grilling taco filling.
        Packing tacos carefully.
        Generating bill for Mexican Tacos
        Order Ready!
        -----------------------------------
* */