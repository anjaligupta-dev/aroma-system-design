package class_06;

public class NonVegEating implements EatingStrategy {
    @Override
    public void eat() {
        System.out.println("Eating non-vegetarian food");
    }
}
