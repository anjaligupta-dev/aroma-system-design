package class_10.RestaurantEg;

public class MountainDew implements Drink {
    @Override
    public String getName() {
        return "Mountain Dew";
    }

    @Override
    public void pour() {
        System.out.println("Pouring Mountain Dew");
    }

    @Override
    public int getVolume() {
        return 150; // volume in ml
    }
}