import java.util.Scanner;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner scan = new Scanner(System.in);
        // Taking the length from the user 
        System.out.print("Enter the length of the Array: ");
        int length = scan.nextInt();
        // Creating an array
        int[] array = new int[length];

        // Taking the elements of the array from the user
        for (int i = 0; i < length; i++) {
            System.out.print("Enter the element of the array at index " + i + ": ");
            array[i] = scan.nextInt();
        }

        // Printing the array
        System.out.println("The array you entered is: ");
        for (int i = 0; i < length; i++) {
            System.out.println("Index [" + i + "]: " + array[i]);
        }

        // Closing the Scanner
        scan.close();
    }
}
