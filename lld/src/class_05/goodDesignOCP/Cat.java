package class_05.goodDesignOCP;

public class Cat implements Animal {
    @Override
    public void feed() {
        System.out.println("Feeding cat...");
    }
}
