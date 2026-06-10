package class_05.goodDesignOCP;

public class Main {
    public static void main(String[] args) {
        AnimalFeeder animalFeeder = new AnimalFeeder();
        animalFeeder.feedAnimal(new Dog()); // Feeding dog...
        animalFeeder.feedAnimal(new Cat()); // Feeding cat...
        animalFeeder.feedAnimal(new Rabbit()); // Feeding rabbit...
    }
}
