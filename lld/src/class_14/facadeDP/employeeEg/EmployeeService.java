package class_14.facadeDP.employeeEg;

public class EmployeeService {
    public void createEmployee(EmployeeRequest request) {
        System.out.println("Employee record created for " + request.getEmployeeName());
    }
}
