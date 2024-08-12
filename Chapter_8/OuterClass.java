public class OuterClass {

    // Static member of OuterClass
    public static String staticMessage = "Static message from OuterClass";

    // Non-static member of OuterClass
    public String nonStaticMessage = "Non-static message from OuterClass";

    // Static nested class
    static class StaticNestedClass {

        // Method to display messages
        public void displayMessages() {
            // Accessing static member of OuterClass
            System.out.println("Accessing static member: " + staticMessage);

            // Trying to access non-static member (will cause an error)
            // System.out.println("Accessing non-static member: " + nonStaticMessage); // Error
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create an instance of StaticNestedClass
        StaticNestedClass nestedInstance = new StaticNestedClass();

        // Call the method to display messages
        nestedInstance.displayMessages();
    }
}
