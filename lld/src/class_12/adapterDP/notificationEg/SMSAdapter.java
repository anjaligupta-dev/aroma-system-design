package class_12.adapterDP.notificationEg;

public class SMSAdapter implements NotificationSender {
    private final SMSSDK smssdk;

    public SMSAdapter(SMSSDK smssdk) {
        this.smssdk = smssdk;
    }

    @Override
    public void sendNotification(String sender, String receiver) {
        // sender -> phoneNumber
        // receiver -> message
        smssdk.sendSMS(Integer.parseInt(sender), receiver);
    }
}
