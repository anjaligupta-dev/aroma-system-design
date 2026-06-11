package class_05.godDesignISP;

public class Main {
    public static void main(String[] args) {
        LivingCat petCat = new PetCat();
        petCat.drinkMilk(); // Pet cat drinks milk.
        petCat.speak(); // Pet cat says: Meow!

        MechanicalCat toyCat = new ToyCat();
        toyCat.speak(); // Toy cat says: Meow!
    }
}
