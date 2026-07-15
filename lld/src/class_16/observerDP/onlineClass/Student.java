package class_16.observerDP.onlineClass;

public class Student implements Observer {
    private String name;
    private String email;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void update(String classTitle) {
        System.out.println("Hi " + name + ", a new class has been scheduled : " + classTitle);
        System.out.println("Sending email to " + email);
    }

    @Override
    public String toString() {
        return name;
    }
}
