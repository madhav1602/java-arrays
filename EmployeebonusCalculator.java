import java.util.Scanner;

public class EmployeebonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialise Arrays
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] newSalary = new double[10];
        double[] bonusAmount = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // User input employee salary and service time
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();
            
            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            yearsOfService[i] = sc.nextDouble();
            
            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input, please enter again.");
                i--; 
            }
        }

        // Calculate bonus amount and new salary
        for (int i = 0; i < 10; i++) {
            double bonusRate;
            if (yearsOfService[i] > 5) {
                bonusRate = 0.05;
            } else {
                bonusRate = 0.02;
            }
            bonusAmount[i] = salary[i] * bonusRate;
            newSalary[i] = salary[i] + bonusAmount[i];
            totalBonus += bonusAmount[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Print the result
        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
