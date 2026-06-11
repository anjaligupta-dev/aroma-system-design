package class_05.badDesignISP;

public class ToyCat implements Cat {
    @Override
    public void drinkMilk() {
        throw new UnsupportedOperationException("Toy cat cannot drink milk.");
    }

    @Override
    public void speak() {
        System.out.println("Toy cat says: Meow!");
    }
}
