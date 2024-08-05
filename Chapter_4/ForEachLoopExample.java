public class ForEachLoopExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Using the typical for loop to iterate over the array
        System.out.println("Printing out array using the traditional for loop.");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        
        System.out.println();

        // Using the for-each loop to iterate over the array
        System.out.println("Printing out array using the for-each loop.");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
