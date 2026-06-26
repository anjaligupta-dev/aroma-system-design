package class_09.factory.notificationEg;

public class Main {
    public static void main(String[] args) {
        Notification notification1 = NotificationFactory.createNotification(NotificationType.PUSH);
        notification1.sendNotification();   // Output : Sending Push notification

        Notification notification2 = NotificationFactory.createNotification(NotificationType.EMAIL);
        notification2.sendNotification();   // Output : Sending Email notification

        Notification notification3 = NotificationFactory.createNotification(NotificationType.SMS);
        notification3.sendNotification();   // Output : Sending SMS notification
    }
}
