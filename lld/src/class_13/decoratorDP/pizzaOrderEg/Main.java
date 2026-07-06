package class_13.decoratorDP.pizzaOrderEg;

public class Main {
    public static void main(String[] args) {
        // Without constructor chaining
        // Adding base as veg pizza
        Pizza vegPizza = new VegPizza();
        // Add extra cheese to Veg Pizza
        vegPizza = new CheeseDecorator(vegPizza);
        // Add extra veggies to veg pizza
        vegPizza = new VeggiesDecorator(vegPizza);

        // print order summary
        System.out.println("Order Summary: " + vegPizza.getDescription());
        System.out.println("Total Cost: " + vegPizza.getCost());

        System.out.println("-----------------------------");


        // With constructor chaining
        Pizza chickenPizza = new ChickenDecorator(
                                    new CheeseDecorator(
                                            new VeggiesDecorator(
                                                    new ChickenPizza()
                                            )
                                    )
                            );

        System.out.println("Order Summary: " + chickenPizza.getDescription());
        System.out.println("Total Cost: " + chickenPizza.getCost());
    }
}
