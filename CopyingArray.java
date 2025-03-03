import java.util.Scanner;

class CopyingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking uer input for rows and columns
        int m = sc.nextInt();
        int n = sc.nextInt();

        // Initialising Arrays
        int[][] array = new int[m][n];
        int[] arr = new int[m * n]; 
        int index = 0;

        // Taking input for 2D array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {  
                array[i][j] = sc.nextInt();
            }
        }

        // Copy elements to 1D array
        for (int i = 0; i < m; i++) {  
            for (int j = 0; j < n; j++) {
                arr[index++] = array[i][j]; 
            }
        }

        // Print 1D array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
