package class_05.badDesignISP;

public class PetCat implements Cat {
    @Override
    public void drinkMilk() {
        System.out.println("Pet cat drinks milk.");
    }

    @Override
    public void speak() {
        System.out.println("Pet cat says: Meow!");
    }
}
