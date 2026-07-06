package class_13.decoratorDP.pizzaOrderEg;

// Step 2 : Concrete Component
public class VegPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Veg Pizza";
    }

    @Override
    public double getCost() {
        return 100.0;
    }
}
