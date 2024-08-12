public class NonStaticOuterClassExample { 

    // Static member of OuterClass 
    public static String staticMessage = "Static message from OuterClass"; 

    // Non-static member of OuterClass 
    public String nonStaticMessage = "Non-static message from OuterClass"; 

    // Non-static inner class 
    class InnerClass { 

        // Method to display messages 
        public void displayMessages() { 
            // Accessing static member of OuterClass 
            System.out.println("Accessing static member: " + staticMessage); 

            // Accessing non-static member of OuterClass 
            System.out.println("Accessing non-static member: " + nonStaticMessage); 
        } 
    } 

    // Main method to run the program 
    public static void main(String[] args) { 
        // Create an instance of OuterClass 
        NonStaticOuterClassExample outerInstance = new NonStaticOuterClassExample(); 

        // Set the non-static member 
        outerInstance.nonStaticMessage = "Updated non-static message"; 

        // Create an instance of InnerClass 
        InnerClass innerInstance = outerInstance.new InnerClass(); 

        // Call the method to display messages 
        innerInstance.displayMessages(); // Displays both static and non-static messages 
    } 
}
