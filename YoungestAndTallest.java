import java.util.Scanner;

public class YoungestAndTallest{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Initialize Arrays
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        // Taking user input for age and height
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            
            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
        }
        
        // Finding youngest and tallest friend using Math.min and Math.max
        int youngest = Math.min(ages[0], Math.min(ages[1], ages[2]));
        double tallest = Math.max(heights[0], Math.max(heights[1], heights[2]));
        
        int youngestIndex = 0;
        int tallestIndex = 0;
        
        for (int i = 0; i < 3; i++) {
            if (ages[i] == youngest) {
                youngestIndex = i;
            }
            if (heights[i] == tallest) {
                tallestIndex = i;
            }
        }
        
        // Printing results
        System.out.println("\nThe youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex] + " years.");
        System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm.");
    }
}
