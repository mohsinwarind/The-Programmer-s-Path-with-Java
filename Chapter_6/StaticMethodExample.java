public class StaticMethodExample {
    // Main Method - Entry point of the program
    public static void main(String[] args) {
        // Calling the static method 'myMethod' directly using the class name
        myMethod(); // Static methods can be called without creating an instance of the class
    }

    // Static Method - Belongs to the class, not to instances of the class
    static void myMethod() {
        // Printing something to the console
        System.out.println("This is a static Method");
        System.out.println("I can call it without making an object of the class");
    }
}



