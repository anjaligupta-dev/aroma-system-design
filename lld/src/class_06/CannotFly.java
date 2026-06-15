package class_06;

public class CannotFly implements FlyingStrategy {
    @Override
    public void fly() {
        System.out.println("Bird cannot fly");
    }
}
