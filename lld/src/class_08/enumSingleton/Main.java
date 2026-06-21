package class_07.enumSingleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        s1.print("Hello, Singleton 1 !");   // Output : Printing: Hello, Singleton 1 !
        Singleton s2 = Singleton.getInstance();
        s2.print("Hello, Singleton 2 !");   // Output : Printing: Hello, Singleton 2 !
    }
}
