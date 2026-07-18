package class_17.observerDP.rideBookingEg;

public class NotificationService implements Observer {
    @Override
    public void update(Ride ride) {
        System.out.println("--- Notification Service ---");
        System.out.println("Sending Push Notification.");
        System.out.println("Sending SMS.");
        System.out.println("Sending Email.");
        System.out.println();
    }

    @Override
    public String toString() {
        return "Notification Service";
    }
}
