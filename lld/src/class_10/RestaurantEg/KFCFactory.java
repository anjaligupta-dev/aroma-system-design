package class_10.RestaurantEg;

public class KFCFactory implements RestaurantFactory {
    @Override
    public MainCourse createMainCourse() {
        return new ChickenBucket();
    }

    @Override
    public Side createSide() {
        return new ChickenPopcorn();
    }

    @Override
    public Drink createDrink() {
        return new MountainDew();
    }
}
