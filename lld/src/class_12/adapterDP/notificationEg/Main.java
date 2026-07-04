package class_12.adapterDP.notificationEg;

public class Main {
    public static void main(String[] args) {
        NotificationSender emailSender = new EmailSender();
        emailSender.sendNotification("sender@example.com", "receiver@example.com"); // Output : Sending email notification from sender@example.com to receiver@example.com

        NotificationSender smsSender = new SMSAdapter(new SMSSDK());
        smsSender.sendNotification("1234567890", "Hello, this is a test SMS!"); // Output : Sending SMS notification from 1234567890 to Hello, this is a test SMS!

        NotificationSender whatsAppSender = new WhatsAppAdapter(new WhatsAppSDK());
        whatsAppSender.sendNotification("987654321", "Hello, this is a test WhatsApp message!");    // Output : Sending WhatsApp message to 987654321 : Message from Hello, this is a test WhatsApp message!
    }
}
