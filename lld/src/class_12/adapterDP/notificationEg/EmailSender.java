package class_12.adapterDP.notificationEg;

public class EmailSender implements NotificationSender {
    @Override
    public void sendNotification(String sender, String receiver) {
        System.out.println("Sending email notification from " + sender + " to " + receiver);
    }
}
