package class_14.facadeDP.employeeEg;

public class AssetService {
    public void allocateLaptop(EmployeeRequest request) {
        System.out.println("Laptop allocated to " + request.getEmployeeName());
    }
}
