public class SingleParameterExample {
    // Main method - entry point of the program
    public static void main(String[] args){
        // Calling the static method Hello with the argument "Mohsin"
        Hello("Mohsin");
    }

    // Static method Hello with a single parameter of type String
    static void Hello(String name){
        // Printing a greeting message using the parameter
        System.out.println("Hello " + name + "!");
    }
}
