package class_05.badDesignOCP;

public class Main {
    public static void main(String[] args) {
        AnimalFeeder animalFeeder = new AnimalFeeder();
        animalFeeder.feedDog(); // feed Cat
        animalFeeder.feedCat(); // feed Dog
    }
}
