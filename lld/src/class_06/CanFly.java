package class_06;

public class CanFly implements FlyingStrategy {
    @Override
    public void fly() {
        System.out.println("Bird can fly");
    }
}
