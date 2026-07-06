package class_13.decoratorDP.pizzaOrderEg;

// Step 4 : Concrete Decorator
public class VeggiesDecorator extends PizzaDecorator {
    public VeggiesDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Extra Veggies";
    }

    @Override
    public double getCost() {
        return super.getCost() + 20.0; // Adding cost for extra veggies
    }
}
