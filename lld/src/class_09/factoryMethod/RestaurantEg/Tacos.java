package class_09.factoryMethod.RestaurantEg;

public class Tacos implements Food {
    @Override
    public void prepare() {
        System.out.println("Preparing taco shells and fillings.");
    }

    @Override
    public void cook() {
        System.out.println("Grilling taco filling.");
    }

    @Override
    public void pack() {
        System.out.println("Packing tacos carefully.");
    }

    @Override
    public String getName() {
        return "Mexican Tacos";
    }

    @Override
    public int getPreparationTime() {
        return 18;
    }
}