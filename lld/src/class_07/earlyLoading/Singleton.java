package class_07.earlyLoading;

public class Singleton {
    private Singleton() {
        System.out.println("Singleton constructor");
    }

    private static Singleton instance = new Singleton();    // Singleton constructor

    public static Singleton getInstance() {
        return instance;
    }

    public static void print() {
        System.out.println("Print Method");
    }
}

