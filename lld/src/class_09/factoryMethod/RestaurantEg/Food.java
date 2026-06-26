package class_09.factoryMethod.RestaurantEg;

public interface Food {
    void prepare();

    void cook();

    void pack();

    String getName();

    int getPreparationTime();
}
