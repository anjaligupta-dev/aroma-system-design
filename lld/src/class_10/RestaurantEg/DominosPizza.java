package class_10.RestaurantEg;

public class DominosPizza implements MainCourse {
    @Override
    public String getName() {
        return "Dominos Pizza";
    }

    @Override
    public void addExtras() {
        System.out.println("Adding cheese, pepperoni, and vegetables to Dominos Pizza.");
    }

    @Override
    public int getCalories() {
        return 300;
    }
}