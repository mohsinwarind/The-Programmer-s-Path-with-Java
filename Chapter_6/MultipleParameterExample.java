public class MultipleParameterExample {

    public static void main(String[] args) {
        // Calling the method and passing arguments
        greet("Mohsin", 20);
    }

    // Method definition with parameters
    static void greet(String name, int age) {
        System.out.println("Hello, " + name + ". You are " + age + " years old.");
    }
}