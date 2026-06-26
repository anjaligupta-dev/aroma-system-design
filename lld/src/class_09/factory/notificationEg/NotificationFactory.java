package class_09.factory.notificationEg;

public class NotificationFactory {
    public static Notification createNotification(NotificationType type) {
        switch (type) {
            case EMAIL:
                return new EmailNotif();
            case SMS:
                return new SMSNotif();
            case PUSH:
                return new PushNotif();
            default:
                throw new IllegalArgumentException("Invalid notification type: " + type);
        }
    }
}
