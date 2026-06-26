package class_09.factory.notificationEg;

public class EmailNotif implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending Email notification");
    }
}

