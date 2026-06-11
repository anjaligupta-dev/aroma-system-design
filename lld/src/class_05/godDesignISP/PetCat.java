package class_05.godDesignISP;

public class PetCat implements LivingCat {
    @Override
    public void drinkMilk() {
        System.out.println("Pet cat drinks milk.");
    }

    @Override
    public void speak() {
        System.out.println("Pet cat says: Meow!");
    }
}
