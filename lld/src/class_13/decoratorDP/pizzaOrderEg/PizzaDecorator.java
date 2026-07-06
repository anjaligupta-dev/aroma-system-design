package class_13.decoratorDP.pizzaOrderEg;

// Step 3 : Abstract Decorator
public abstract class PizzaDecorator implements Pizza {
    protected final Pizza pizza;  // Composition

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}
