import java.util.Scanner;

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

public class SecondCompileTimePolymorphismExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter the number of values to add (2 or 3): ");
        int count = scanner.nextInt();

        if (count == 2) {
            System.out.print("Enter two numbers: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            System.out.println("Sum of two numbers: " + calc.add(num1, num2));
        } else if (count == 3) {
            System.out.print("Enter three numbers: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();
            System.out.println("Sum of three numbers: " + calc.add(num1, num2, num3));
        } else {
            System.out.println("Invalid number of values.");
        }
    }
}
