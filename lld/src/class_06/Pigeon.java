package class_06;

public class Pigeon extends Bird {
    public Pigeon() {
        super(new CanFly(), new NonVegEating());
    }
}
