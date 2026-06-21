package class_08.lazyLoadingDoubleLocking;

public class Singleton {
    private Singleton(String createdBy) {
        System.out.println("Constructor created by : " + createdBy);
    }

    private static volatile Singleton instance = null;

    public static Singleton getInstance(String createdBy) {
        if (instance == null) {
            synchronized (Singleton.class) {    // Lock on Singleton.class
                if (instance == null) {
                    instance = new Singleton(createdBy);
                }
            }
        }
        return instance;
    }
}

