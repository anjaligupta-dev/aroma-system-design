package class_13.decoratorDP.pizzaOrderEg;

// Step 2 : Concrete Component
public class ChickenPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Chicken Pizza";
    }

    @Override
    public double getCost() {
        return 150.0;
    }
}
