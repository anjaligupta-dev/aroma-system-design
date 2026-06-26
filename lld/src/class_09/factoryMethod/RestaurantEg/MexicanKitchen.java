package class_09.factoryMethod.RestaurantEg;

public class MexicanKitchen extends KitchenService {
    @Override
    protected Food cookMeal() {
        return new Tacos();
    }
}
