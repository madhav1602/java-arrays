import java.util.Scanner;

public class StudentGrade2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Initialise Arrays
        int[][] marks = new int[n][3];
        double[] percentages = new double[n];
        String[] grades = new String[n];

        // Take input for marks in three subjects
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();
            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();

            // Calculate percentage
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // calculate grade
            if (percentages[i] >= 90)
                grades[i] = "A";
            else if (percentages[i] >= 80)
                grades[i] = "B";
            else if (percentages[i] >= 70)
                grades[i] = "C";
            else if (percentages[i] >= 60)
                grades[i] = "D";
            else
                grades[i] = "F";
        }

        // Print the results
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics: " + marks[i][0] + " Chemistry: " + marks[i][1] + " Maths: " + marks[i][2]);
            System.out.println("Percentage: " + percentages[i] + "% Grade: " + grades[i]);
        }
    }
}
