package class_06;

public class Ostrich extends Bird {
    public Ostrich() {
        super(new CannotFly(), new NonVegEating());
    }
}
