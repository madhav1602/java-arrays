import java.util.Scanner;

class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Check for negative number
        if (number <= 0) {
            System.out.println("Enter a positive number");
            return;
        }

        // Initialise Array
        String[] array = new String[number + 1];

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                array[i] = "FizzBuzz";
            } 
            else if (i % 3 == 0) {
                array[i] = "Fizz";
            } 
            else if (i % 5 == 0) {
                array[i] = "Buzz";
            } 
            else {
                array[i] = i + "";  
            }
        }

        // Print the result
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + array[i]);
        }
    }
}
