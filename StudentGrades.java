import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Initialise Array
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Take input for marks
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Physics marks for student " + (i + 1) + ": ");
            physics[i] = sc.nextInt();
            System.out.print("Enter Chemistry marks for student " + (i + 1) + ": ");
            chemistry[i] = sc.nextInt();
            System.out.print("Enter Maths marks for student " + (i + 1) + ": ");
            maths[i] = sc.nextInt();

            // Calculate percentage
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            // Determine grade
            if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 80)
                grade[i] = 'B';
            else if (percentage[i] >= 70)
                grade[i] = 'C';
            else if (percentage[i] >= 60)
                grade[i] = 'D';
            else
                grade[i] = 'F';
        }

        // Print the results
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " - Physics: " + physics[i] + ", Chemistry: " + chemistry[i] + ", Maths: " + maths[i] + ", Percentage: " + percentage[i] + "%, Grade: " + grade[i]);
        }
    }
}
