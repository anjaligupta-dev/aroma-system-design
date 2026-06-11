package class_05.godDesignISP;

public class ToyCat implements MechanicalCat {
    @Override
    public void speak() {
        System.out.println("Toy cat says: Meow!");
    }
}
