package class_05.goodDesignDIP;

public class Main {
    public static void main(String[] args) {
        MessageService email = new EmailService();
        MessageService sms = new SMSService();

        Notification notifyByEmail = new Notification(email);
        notifyByEmail.send("Your order has been shipped!"); // Email sent: Your order has been shipped!

        Notification notifyBySMS = new Notification(sms);
        notifyBySMS.send("Your OTP is 123456"); // SMS sent: Your OTP is 123456
    }
}
