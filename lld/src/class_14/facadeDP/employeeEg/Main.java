package class_14.facadeDP.employeeEg;

public class Main {
    public static void main(String[] args) {
        EmployeeRequest request = new EmployeeRequest("John Doe", "john.doe@company.com", "Engineering");
        EmployeeOnboardingFacade facade = new EmployeeOnboardingFacade();
        facade.onboardEmployee(request);
    }
}


/* *
    Output :
        Employee record created for John Doe
        Company email account created: john.doe@company.com
        Laptop allocated to John Doe
        Access granted to Jira, GitHub and VPN.
        Employee registered in payroll.
        Welcome email sent to john.doe@company.com
        Employee onboarding completed successfully.
* */