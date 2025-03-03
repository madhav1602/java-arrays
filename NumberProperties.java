import java.util.Scanner;

public class NumberProperties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      // Initializing Aray
        int[] numbers = new int[5];

        // Taking input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Checking number properties
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println("The number " + numbers[i] + " is positive and even.");
                } 
		else {
                    System.out.println("The number " + numbers[i] + " is positive and odd.");
                }
            } 
	    else if (numbers[i] < 0) {
                System.out.println("The number " + numbers[i] + " is negative.");
            } 
	    else {
                System.out.println("The number is zero.");
            }
        }

        // Comparing first and last elements
        if (numbers[0] > numbers[4]) {
            System.out.println("The first number is greater than the last number.");
        } 
        else if (numbers[0] < numbers[4]) {
            System.out.println("The first number is less than the last number.");
        } 
        else {
            System.out.println("The first and last numbers are equal.");
        }

        
    }
}
