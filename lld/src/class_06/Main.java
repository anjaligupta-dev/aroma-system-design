package class_06;

public class Main {
    public static void main(String[] args) {
        // To test all the birds
        Bird[] birds = {
                new Sparrow(),
                new Crow(),
                new Pigeon(),
                new Penguin(),
                new Ostrich()
        };

        for (Bird bird : birds) {
            System.out.println("Bird " + bird.getClass().getSimpleName() + ":");
            bird.performFly();
            bird.performEat();
            System.out.println();
        }
    }
}


/* *

    Output :
        Bird Sparrow:
        Bird can fly
        Eating vegetables

        Bird Crow:
        Bird can fly
        Eating vegetables

        Bird Pigeon:
        Bird can fly
        Eating non-vegetarian food

        Bird Penguin:
        Bird cannot fly
        Eating non-vegetarian food

        Bird Ostrich:
        Bird cannot fly
        Eating non-vegetarian food

* */