import java.util.Scanner;

public class MeanHeightCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialise Array
        double[] heights = new double[11];

        // Variable to store sum of height
        double sum = 0; 

        // Take input for each player and Add them
        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < 11; i++) {
            heights[i] = scanner.nextDouble();
            sum += heights[i]; 
        }

        // Calculate the mean height
        double meanHeight = sum / heights.length;

        // Print the result
        System.out.println("Mean height of the football team: " + meanHeight);

        
    }
}
