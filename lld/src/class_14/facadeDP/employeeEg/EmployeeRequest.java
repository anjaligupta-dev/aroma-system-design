package class_14.facadeDP.employeeEg;

public class EmployeeRequest {
    private String employeeName;
    private String email;
    private String department;

    public EmployeeRequest(String employeeName, String email, String department) {
        this.employeeName = employeeName;
        this.email = email;
        this.department = department;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }
}
