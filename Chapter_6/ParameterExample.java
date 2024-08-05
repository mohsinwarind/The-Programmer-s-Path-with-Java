import java.util.Scanner;
public class ParameterExample {

    public static void main(String[] args) {
        //Scanner Object
        Scanner scan = new Scanner(System.in);
        //Taking the name from the user
        System.out.print("Enter your name :");
        String name = scan.nextLine();
        //Taking the age from the user
        System.out.print("Enter your age : ");
        int age = scan.nextInt();
        // Calling the method and passing arguments
        greet(name, age);

        // Closing the Scanner
        scan.close();
    }

    // Method definition with parameters
    static void greet(String name, int age) {
        System.out.println("Hello, " + name + ". You are " + age + " years old.");
    }
    
}