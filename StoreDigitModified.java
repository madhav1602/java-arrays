import java.util.Arrays;
import java.util.Scanner;

public class StoreDigitModified {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); 

        // Initialise Array
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Remove digits and store in array
        while (number != 0) {
            if (index == maxDigit) {
                // Increase size
                maxDigit = maxDigit + 10;
                digits = Arrays.copyOf(digits, maxDigit);
            }

            digits[index] = number % 10;
            number /= 10;
            index++;
        }

    

        // Find largest and second largest 
        int largest = 0, secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } 
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Print results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
