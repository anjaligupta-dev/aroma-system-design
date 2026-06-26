package class_09.factoryMethod.RestaurantEg;

public abstract class KitchenService {
    // Factory Method
    protected abstract Food cookMeal();

    // Common Business Logic
    public final void processOrder() {
        System.out.println("Customer placed an order.");

        Food food = cookMeal();

        System.out.println("Selected Food : " + food.getName());

        System.out.println("Estimated Time : " + food.getPreparationTime() + " minutes");

        food.prepare();

        food.cook();

        food.pack();

        generateBill(food);

        System.out.println("Order Ready!");

        System.out.println("-----------------------------------");
    }

    private void generateBill(Food food) {
        System.out.println("Generating bill for " + food.getName());
    }
}
