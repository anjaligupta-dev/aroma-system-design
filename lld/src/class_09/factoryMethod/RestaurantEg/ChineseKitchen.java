package class_09.factoryMethod.RestaurantEg;

public class ChineseKitchen extends KitchenService {
    @Override
    protected Food cookMeal() {
        return new Noodles();
    }
}
