import java.util.Scanner;
import java.util.Arrays;  // Import Arrays for copyOf()

class FactorFinder {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	
	// Initialise array and take user inputs
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int number = sc.nextInt();
        int index = 0;

        // Loop to find factors
        for (int i = 1; i <= number; i++) {  
            if (number % i == 0) {

                // Resize array if full
                if (index == maxFactor) {
                    maxFactor = maxFactor * 2;
                    factors = Arrays.copyOf(factors, maxFactor);
                }
                factors[index] = i;
		index++;
            }
        }

        // Print the result
        System.out.print("Factors: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
