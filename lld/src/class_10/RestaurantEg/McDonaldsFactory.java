package class_10.RestaurantEg;

public class McDonaldsFactory implements RestaurantFactory {
    @Override
    public MainCourse createMainCourse() {
        return new McBurger();
    }

    @Override
    public Side createSide() {
        return new Fries();
    }

    @Override
    public Drink createDrink() {
        return new Coke();
    }
}
