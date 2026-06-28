package class_10.RestaurantEg;

public class DominosFactory implements RestaurantFactory {
    @Override
    public MainCourse createMainCourse() {
        return new DominosPizza();
    }

    @Override
    public Side createSide() {
        return new GarlicBread();
    }

    @Override
    public Drink createDrink() {
        return new Pepsi();
    }
}
