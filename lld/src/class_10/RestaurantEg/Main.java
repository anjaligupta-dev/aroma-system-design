package class_10.RestaurantEg;

public class Main {
    public static void main(String[] args) {
        orderMeal("Dominos", new DominosFactory());
        orderMeal("McDonald's", new McDonaldsFactory());
        orderMeal("KFC", new KFCFactory());
    }


    private static void orderMeal(String restaurantName, RestaurantFactory factory) {
        System.out.println("\n---------- " + restaurantName + " ----------");

        MainCourse mainCourse = factory.createMainCourse();
        Side side = factory.createSide();
        Drink drink = factory.createDrink();
        
        // Main Course
        System.out.println("Main Course : " + mainCourse.getName());
        mainCourse.addExtras();
        System.out.println("Calories    : " + mainCourse.getCalories());
        System.out.println();

        // Side
        System.out.println("Side        : " + side.getName());
        side.cookingTemp();
        System.out.println("Spicy       : " + side.isSpicy());
        System.out.println();

        // Drink
        System.out.println("Drink       : " + drink.getName());
        drink.pour();
        System.out.println("Volume      : " + drink.getVolume() + " ml");
    }
}


/* *

    Output :
        ---------- Dominos ----------
        Main Course : Dominos Pizza
        Adding cheese, pepperoni, and vegetables to Dominos Pizza.
        Calories    : 300

        Side        : Garlic Bread
        Garlic Bread is baked at 180°C for 15 minutes.
        Spicy       : false

        Drink       : Pepsi
        Pouring Pepsi.
        Volume      : 330 ml

        ---------- McDonald's ----------
        Main Course : McBurger
        Adding lettuce, tomato, and cheese to McBurger.
        Calories    : 450

        Side        : Fries
        Fries are cooked at 220 degrees Celsius.
        Spicy       : false

        Drink       : Coke
        Pouring Coke
        Volume      : 500 ml

        ---------- KFC ----------
        Main Course : Chicken Bucket
        Adding extra sauces to the chicken bucket.
        Calories    : 1200

        Side        : Chicken Popcorn
        Chicken Popcorn is cooked at 150 degrees Celsius.
        Spicy       : true

        Drink       : Mountain Dew
        Pouring Mountain Dew
        Volume      : 150 ml

 * */