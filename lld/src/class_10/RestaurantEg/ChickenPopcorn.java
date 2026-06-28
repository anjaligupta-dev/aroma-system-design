package class_10.RestaurantEg;

public class ChickenPopcorn implements Side {
    @Override
    public String getName() {
        return "Chicken Popcorn";
    }

    @Override
    public void cookingTemp() {
        System.out.println("Chicken Popcorn is cooked at 150 degrees Celsius.");
    }

    @Override
    public boolean isSpicy() {
        return true;
    }
}