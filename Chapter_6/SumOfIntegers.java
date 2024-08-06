public class SumOfIntegers {

    static int sum(int n) {
        // Base case
        if (n == 1) {
            return 1;
        } else {
            // Recursive case
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Sum of integers from 1 to " + number + " is " + sum(number));
    }
}


