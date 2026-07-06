package class_14.facadeDP.employeeEg;

public class NotificationService {
    public void sendWelcomeEmail(EmployeeRequest request) {
        System.out.println("Welcome email sent to " + request.getEmail());
    }
}
