import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        
        // Check for valid natural number
        if (number < 1) {
            System.out.println("Error: Enter a natural number.");
            return;
        }

        // Initialise Arrays
        int[] oddArray = new int[(number + 1) / 2];
        int[] evenArray = new int[number / 2];
        
        int oddIndex = 0, evenIndex = 0;

       // Check for odd and even
        for (int num = 1; num <= number; num++) {
            if (num % 2 == 0) {
                evenArray[evenIndex] = num;
                evenIndex++;
            } else {
                oddArray[oddIndex] = num;
                oddIndex++;
            }
        }

        // Print odd array
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddArray[i] + " ");
        }
        System.out.println();

        // Print even array
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenArray[i] + " ");
        }
        
        
    }
}
