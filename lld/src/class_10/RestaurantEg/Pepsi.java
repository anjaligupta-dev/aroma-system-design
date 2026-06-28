package class_10.RestaurantEg;

public class Pepsi implements Drink {
    @Override
    public String getName() {
        return "Pepsi";
    }

    @Override
    public void pour() {
        System.out.println("Pouring Pepsi.");
    }

    @Override
    public int getVolume() {
        return 330; // volume in ml
    }
}