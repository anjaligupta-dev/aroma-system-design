package class_12.adapterDP.notificationEg;

public class WhatsAppAdapter implements NotificationSender {
    private final WhatsAppSDK whatsAppSDK;

    public WhatsAppAdapter(WhatsAppSDK whatsAppSDK) {
        this.whatsAppSDK = whatsAppSDK;
    }

    @Override
    public void sendNotification(String sender, String receiver) {
        // mapping values
        // sender -> mobile number -> parsing it to int to match the datatype
        // receiver -> text
        whatsAppSDK.sendWhatsAppMessage(Integer.parseInt(sender), "Message from " + receiver);
    }
}
