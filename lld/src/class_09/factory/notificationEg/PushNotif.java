package class_09.factory.notificationEg;

public class PushNotif implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending Push notification");
    }
}

