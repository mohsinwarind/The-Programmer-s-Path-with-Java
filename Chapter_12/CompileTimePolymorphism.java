class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calls the method with two parameters
        System.out.println("Sum of two numbers: " + calc.add(10, 20));

        // Calls the method with three parameters
        System.out.println("Sum of three numbers: " + calc.add(10, 20, 30));
    }
}
