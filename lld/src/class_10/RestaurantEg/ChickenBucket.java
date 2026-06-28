package class_10.RestaurantEg;

public class ChickenBucket implements MainCourse {
    @Override
    public String getName() {
        return "Chicken Bucket";
    }

    @Override
    public void addExtras() {
        System.out.println("Adding extra sauces to the chicken bucket.");
    }

    @Override
    public int getCalories() {
        return 1200; // Example calorie count for a chicken bucket
    }
}