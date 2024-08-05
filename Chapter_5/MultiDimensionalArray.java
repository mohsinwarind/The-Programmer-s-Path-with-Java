import java.util.Scanner;
public class MultiDimensionalArray {
    public static void main(String[] args){
        // Scanner object
        Scanner scan = new Scanner(System.in);
        //Creating a 2D array of 3 rows and 3 columns
        int[][] array = new int[3][3];
        // Taking the elements of the array from the user
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Enter the element of the array at index [" + i + "][" + j + "]: ");
                array[i][j] = scan.nextInt();
            }
        }
        // Printing the array
        System.out.println("The Matrix you entered is: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        // Closing the Scanner
        scan.close();
        
    }
    
}