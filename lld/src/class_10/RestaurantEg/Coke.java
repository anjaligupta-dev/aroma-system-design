package class_10.RestaurantEg;

public class Coke implements Drink {
    @Override
    public String getName() {
        return "Coke";
    }

    @Override
    public void pour() {
        System.out.println("Pouring Coke");
    }

    @Override
    public int getVolume() {
        return 500; // volume in ml
    }
}
