package class_09.factory.notificationEg;

public class SMSNotif implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending SMS notification");
    }
}
