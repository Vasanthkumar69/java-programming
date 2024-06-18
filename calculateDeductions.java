import java.util.Scanner;

class EmployeePayslip {
    String employeeName;
    double basicPay;
    double da;
    double hra;
    double deductions;
    double netPay;

    public EmployeePayslip(String employeeName, double basicPay, boolean isUrban) {
        this.employeeName = employeeName;
        this.basicPay = basicPay;
        this.da = calculateDA(basicPay, isUrban);
        this.hra = calculateHRA(basicPay);
        this.deductions = calculateDeductions();
        this.netPay = calculateNetPay();
    }

    private double calculateDA(double basic, boolean isUrban) {
        return basic * (isUrban ? 0.05 : 0.10);
    }

    private double calculateHRA(double basic) {
        return basic * 0.20; // Assuming HRA is 20% of basic pay
    }

    private double calculateDeductions() {
        double festivalAdvanceMonthly = 1000.00;
        double housingLoanMonthly = 20000.00 / (15 * 12); // Divided by 15 years in months
        return festivalAdvanceMonthly + housingLoanMonthly;
    }

    private double calculateNetPay() {
        return basicPay + da + hra - deductions;
    }

    public void displayPayslip() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("Deductions: " + deductions);
        System.out.println("Net Pay: " + netPay);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter basic pay: ");
        double basicPay = scanner.nextDouble();

        System.out.print("Is the employee from an urban area? (true/false): ");
        boolean isUrban = scanner.nextBoolean();

        EmployeePayslip payslip = new EmployeePayslip(employeeName, basicPay, isUrban);
        payslip.displayPayslip();

        scanner.close();
    }
}
