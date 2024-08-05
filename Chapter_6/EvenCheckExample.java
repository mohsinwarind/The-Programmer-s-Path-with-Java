public class EvenCheckExample { 
    // Method to check if a number is even 
    static boolean isEven(int number) { 
        return number % 2 == 0; 
    } 

    public static void main(String[] args) { 
        // Calling the method and storing the result 
        boolean result1 = isEven(4); // Should return true 
        boolean result2 = isEven(7); // Should return false 

        // Printing the results 
        System.out.println("Is 4 even? " + result1); 
        System.out.println("Is 7 even? " + result2); 
    } 
}


