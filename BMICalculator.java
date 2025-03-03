import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of persons
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        // Initialise Arrays 
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Take input for height and weight
        for (int i = 0; i < n; i++) {
            System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
            height[i] = sc.nextDouble();
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();

            // Calculate BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // calculate status
            if (bmi[i] <= 18.4)
                status[i] = "Underweight";
            else if (bmi[i] >= 18.5 && bmi[i] <= 24.9)
                status[i] = "Normal";
            else if (bmi[i] >= 25.0 && bmi[i] <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        // Display the results
        for (int i = 0; i < n; i++) {
            System.out.println("Height: " + height[i] + " Weight: " + weight[i] + " BMI: " + bmi[i] + " Status: " + status[i]);
        }
    }
}
