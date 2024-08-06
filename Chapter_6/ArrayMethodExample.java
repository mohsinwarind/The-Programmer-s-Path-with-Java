public class ArrayMethodExample {
    public static void main(String[] args) {
        // Creating and initializing an array
        int[] numbers = {1, 2, 3, 4, 5};

        // Calling the method and passing the array
        int sum = calculateSum(numbers);

        // Printing the sum of the array elements
        System.out.println("The sum of the array elements is: " + sum);
    }

    // Method to calculate the sum of array elements
    static int calculateSum(int[] arr) {
        int sum = 0;
        // Iterating through the array elements and calculating the sum
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}



