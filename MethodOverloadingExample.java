public class MethodOverloadingExample {

    // Method to add two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Calling the first add method
        int sum1 = add(10, 20); // Calls add(int, int)
        System.out.println("Sum of 10 and 20: " + sum1);

        // Calling the second add method
        int sum2 = add(10, 20, 30); // Calls add(int, int, int)
        System.out.println("Sum of 10, 20, and 30: " + sum2);

        // Calling the third add method
        double sum3 = add(10.5, 20.5); // Calls add(double, double)
        System.out.println("Sum of 10.5 and 20.5: " + sum3);
    }
}
