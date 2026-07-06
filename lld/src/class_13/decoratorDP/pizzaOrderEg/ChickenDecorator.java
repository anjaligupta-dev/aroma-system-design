package class_13.decoratorDP.pizzaOrderEg;

// Step 4 : Concrete Decorator
public class ChickenDecorator extends PizzaDecorator {
    public ChickenDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Extra Chicken";
    }

    @Override
    public double getCost() {
        return super.getCost() + 25.0; // Adding cost for extra chicken
    }
}