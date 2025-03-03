import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Store multiplication results
        for (int i = 0; i < 10; i++) {
            arr[i] = num * (i + 1);
        }

        // Print multiplication table
        for (int i = 0; i < 10; i++) {
            System.out.println(num + " * " + (i + 1) + " = " + arr[i]);
        }

        
    }
}
