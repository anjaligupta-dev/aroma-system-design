package class_05.badDesignDIP;

public class Notification {
    private EmailService emailService;
    public Notification() {
        this.emailService = new EmailService();
    }

    public void send(String message) {
        emailService.sendEmail(message);
    }
}
