package class_06;

public class Crow extends Bird {
    public Crow() {
        super(new CanFly(), new VegEating());
    }
}
