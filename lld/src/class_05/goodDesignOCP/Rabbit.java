package class_05.goodDesignOCP;

public class Rabbit implements Animal {
    @Override
    public void feed() {
        System.out.println("Feeding rabbit...");
    }
}
