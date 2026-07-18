package class_17.observerDP.eCommerceEg;

public class NotificationService implements Observer {
    @Override
    public void update(Order order) {
        System.out.println("========== Notification Service ==========");
        System.out.println("Preparing confirmation message...");
        System.out.println("Sending Email to " + order.getCustomerName());
        System.out.println("Sending SMS.");
        System.out.println("Sending Push Notification.");
        System.out.println("Customer notified successfully.");
    }

    public String toString() {
        return "Notification Service";
    }
}
