package class_10.RestaurantEg;

public class Fries implements Side {
    @Override
    public String getName() {
        return "Fries";
    }

    @Override
    public void cookingTemp() {
        System.out.println("Fries are cooked at 220 degrees Celsius.");
    }

    @Override
    public boolean isSpicy() {
        return false;
    }
}
