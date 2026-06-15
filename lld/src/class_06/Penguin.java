package class_06;

public class Penguin extends Bird {
    public Penguin() {
        super(new CannotFly(), new NonVegEating());
    }
}
