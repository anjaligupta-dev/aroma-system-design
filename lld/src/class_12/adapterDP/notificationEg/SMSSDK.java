package class_12.adapterDP.notificationEg;

public class SMSSDK {
    public void sendSMS(int phoneNumber, String message) {
        System.out.println("Sending SMS to " + phoneNumber + " with message : " + message);
    }
}
