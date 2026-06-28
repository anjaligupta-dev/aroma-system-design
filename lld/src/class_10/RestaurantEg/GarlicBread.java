package class_10.RestaurantEg;

public class GarlicBread implements Side {
    @Override
    public String getName() {
        return "Garlic Bread";
    }

    @Override
    public void cookingTemp() {
        System.out.println("Garlic Bread is baked at 180°C for 15 minutes.");
    }

    @Override
    public boolean isSpicy() {
        return false;
    }
}