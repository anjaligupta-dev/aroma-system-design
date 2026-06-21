package class_08.lazyLoadingSynch;

public class Singleton {
    private Singleton(String createdBy) {
        System.out.println("Constructor created by : " + createdBy);
    }

    private static Singleton instance = null;

    public static synchronized Singleton getInstance(String createdBy) {
        if (instance == null) {
            instance = new Singleton(createdBy);    // Parameterized constructor
        }
        return instance;
    }
}
