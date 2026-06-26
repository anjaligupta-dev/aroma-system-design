package class_09.factoryMethod.RestaurantEg;

public class Pizza implements Food {
    @Override
    public void prepare() {
        System.out.println("Preparing pizza dough, cheese and toppings.");
    }

    @Override
    public void cook() {
        System.out.println("Baking pizza in oven.");
    }

    @Override
    public void pack() {
        System.out.println("Packing pizza in pizza box.");
    }

    @Override
    public String getName() {
        return "Italian Pizza";
    }

    @Override
    public int getPreparationTime() {
        return 20;
    }
}