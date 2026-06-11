package class_05.badDesignDIP;

public class Main {
    public static void main(String[] args) {
        Notification notifyByEmail = new Notification();
        notifyByEmail.send("Your order has been shipped!"); // Email sent: Your order has been shipped!
    }
}
