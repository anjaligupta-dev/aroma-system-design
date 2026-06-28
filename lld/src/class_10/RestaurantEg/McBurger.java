package class_10.RestaurantEg;

public class McBurger implements MainCourse {
    @Override
    public String getName() {
        return "McBurger";
    }

    @Override
    public void addExtras() {
        System.out.println("Adding lettuce, tomato, and cheese to McBurger.");
    }

    @Override
    public int getCalories() {
        return 450;
    }
}
