import java.util.Scanner;

public class VotingPrivelege {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

	// Initializing Array
        int[] ages = new int[10];

        // Taking input for 10 students' ages
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

	// Checking Voting Eligibility
	for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age: " + ages[i]);
            } 
	    else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } 
	    else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }
 

       
    }
}

