package class_16.observerDP.onlineClass;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", "alice@gmail.com");
        Student s2 = new Student("Bob", "bob@gmail.com");
        Student s3 = new Student("Charlie", "charlie@gmail.com");
        Student s4 = new Student("Jessica", "jessica@gmail.com");

        ClassScheduler scheduler = new ClassScheduler();
        scheduler.registerObserver(s1);
        scheduler.registerObserver(s2);
        scheduler.registerObserver(s3);
        scheduler.registerObserver(s4);
        scheduler.scheduleClass("Low Level Design Class");

        System.out.println("------------------------------");
        // Charlie is not interested in this class
        scheduler.removeObserver(s3);
        scheduler.scheduleClass("High Level Design Class");
    }
}
