package class_06;

abstract class Bird {
    private double weight;
    private String name;
    private double size;
    private String color;
    private String type;

    // Composition
    protected FlyingStrategy flyingStrategy;
    protected EatingStrategy eatingStrategy;

    // Constructor Injection
    public Bird(FlyingStrategy flyingStrategy, EatingStrategy eatingStrategy) {
        this.flyingStrategy = flyingStrategy;
        this.eatingStrategy = eatingStrategy;
    }

    void performEat() {
        eatingStrategy.eat();
    }

    public void speak() {
        // Detailed logic
        System.out.println("Bird is speaking");
    }

    public void performFly() {
        flyingStrategy.fly();
    }
}
