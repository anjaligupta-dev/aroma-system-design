package class_09.factoryMethod.RestaurantEg;

public class ItalianKitchen extends KitchenService {
    @Override
    protected Food cookMeal() {
        return new Pizza();
    }
}
