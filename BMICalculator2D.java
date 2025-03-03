import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of persons
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        // Initialise Arrays
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        // Take input for height and weight
        for (int i = 0; i < n; i++) {
            System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();

            // Calculate BMI
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // calculate status
            if (personData[i][2] <= 18.4)
                weightStatus[i] = "Underweight";
            else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9)
                weightStatus[i] = "Normal";
            else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        // Print Result
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + " - Height: " + personData[i][0] + " m, Weight: " + personData[i][1] + " kg, BMI: " + personData[i][2] + ", Status: " + weightStatus[i]);
        }
    }
}
