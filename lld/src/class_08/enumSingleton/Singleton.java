package class_07.enumSingleton;

public enum Singleton {
    INSTANCE;   // object of Singleton

    public static Singleton getInstance() {
        return Singleton.INSTANCE;  // only one object is created
    }

    public void print(String msg) {
        System.out.println("Printing: " + msg);
    }
}
