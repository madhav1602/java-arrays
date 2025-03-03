import java.util.Scanner;

public class StoreDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Initialise Array
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        
        // Remove last digit and store in array
        while (number != 0 ) {
            digits[index] = number % 10; 
            number /= 10; 
            index++;
        }
        
        int largest = 0;
        int secondLargest = 0;
        
        // Find largest and second largest digits
       for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        
        //  Print results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
