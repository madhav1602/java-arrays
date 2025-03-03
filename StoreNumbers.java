import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double sum = 0.0;
        int index = 0;

        System.out.println("Enter numbers (max 10). Enter 0 or a negative number to stop:");

        // Input loop with conditions
        while (index < 10) {
            double var = sc.nextDouble();
            if (var <= 0) {
                break; 
            }
            arr[index] = var;
            index++;
        }

        // Print numbers and calculate sum
        System.out.print("Stored numbers: ");
        for (int j = 0; j < index; j++) {
            System.out.print(arr[j] + " ");
            sum += arr[j];
        }

        // Print sum
        System.out.println("\n Sum: " + sum);

       
    }
}
