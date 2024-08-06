public class VarargsSumExample {
    public static void main(String[] args) {
        // Calling the method with multiple integer arguments
        int sum = sumNumbers(1, 2, 3, 4, 5);

        // Printing the sum of the numbers
        System.out.println("Sum of numbers: " + sum);
    }

    // Method to sum multiple numbers using varargs
    static int sumNumbers(int... numbers) {
        int sum = 0;
        // Iterating through each number argument and adding to the sum
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
