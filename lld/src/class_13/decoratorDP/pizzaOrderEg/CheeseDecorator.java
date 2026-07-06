package class_13.decoratorDP.pizzaOrderEg;

// Step 4 : Concrete Decorator
public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Extra Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 15.0; // Adding cost for extra cheese
    }
}
