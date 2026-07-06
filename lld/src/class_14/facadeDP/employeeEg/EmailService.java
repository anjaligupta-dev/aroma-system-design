package class_14.facadeDP.employeeEg;

public class EmailService {
    public void createEmailAccount(EmployeeRequest request) {
        System.out.println("Company email account created: " + request.getEmail());
    }
}
