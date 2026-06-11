package class_05.badDesignISP;

public class Main {
    public static void main(String[] args) {
        Cat petCat = new PetCat();
        petCat.drinkMilk(); // Pet cat drinks milk.
        petCat.speak(); // Pet cat says: Meow!

        Cat toyCat = new ToyCat();
        toyCat.speak(); // Toy cat says: Meow!
        toyCat.drinkMilk(); // Throws UnsupportedOperationException
    }
}
