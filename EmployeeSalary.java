import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        double hoursWorked, hourlyRate;
        double grossSalary, tax, netSalary;
		
		
		
        System.out.print("Enter employee name: ");
        name = input.nextLine();

        System.out.print("Enter hours worked: ");
        hoursWorked = input.nextDouble();

        System.out.print("Enter hourly rate: ");
        hourlyRate = input.nextDouble();

        grossSalary = hoursWorked * hourlyRate;
        tax = grossSalary * 0.10;
        netSalary = grossSalary - tax;

        System.out.println("\n----- Employee Salary Details -----");
        System.out.println("Employee Name : " + name);
        System.out.println("Hours Worked  : " + hoursWorked);
        System.out.println("Hourly Rate   : " + hourlyRate);
        System.out.println("Gross Salary  : " + grossSalary);
        System.out.println("Tax (10%)     : " + tax);
        System.out.println("Net Salary    : " + netSalary);

        input.close();
    }
}