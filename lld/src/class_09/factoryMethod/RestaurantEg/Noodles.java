package class_09.factoryMethod.RestaurantEg;

public class Noodles implements Food {
    @Override
    public void prepare() {
        System.out.println("Chopping vegetables and boiling noodles.");
    }

    @Override
    public void cook() {
        System.out.println("Stir frying noodles.");
    }

    @Override
    public void pack() {
        System.out.println("Packing noodles in takeaway box.");
    }

    @Override
    public String getName() {
        return "Chinese Noodles";
    }

    @Override
    public int getPreparationTime() {
        return 15;
    }
}