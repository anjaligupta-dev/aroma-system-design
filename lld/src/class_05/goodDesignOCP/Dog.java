package class_05.goodDesignOCP;

public class Dog implements Animal {
    @Override
    public void feed() {
        System.out.println("Feeding dog...");
    }
}
