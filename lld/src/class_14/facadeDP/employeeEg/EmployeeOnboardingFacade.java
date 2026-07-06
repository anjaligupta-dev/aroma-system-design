package class_14.facadeDP.employeeEg;

public class EmployeeOnboardingFacade {
    private EmployeeService employeeService;
    private EmailService emailService;
    private AssetService assetService;
    private AccessService accessService;
    private PayrollService payrollService;
    private NotificationService notificationService;

    public EmployeeOnboardingFacade() {
        employeeService = new EmployeeService();
        emailService = new EmailService();
        assetService = new AssetService();
        accessService = new AccessService();
        payrollService = new PayrollService();
        notificationService = new NotificationService();
    }

    public void onboardEmployee(EmployeeRequest request) {
        employeeService.createEmployee(request);
        emailService.createEmailAccount(request);
        assetService.allocateLaptop(request);
        accessService.grantAccess(request);
        payrollService.registerEmployee(request);
        notificationService.sendWelcomeEmail(request);
        System.out.println("Employee onboarding completed successfully.");
    }
}
