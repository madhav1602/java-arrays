import java.util.Scanner;

public class Multiplication6to9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialise Array
        int[] multiplication = new int[4];

        // User input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate multiplication table from 6 to 9
        int multiplier = 6;
        for (int i = 0; i < 4; i++) {
            multiplication[i] = multiplier * number;
            multiplier++;
        }

        // Print multiplication results 
        System.out.println("Multiplication Table from 6 to 9:");
        for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplication[i]);
        }
    }
}	
