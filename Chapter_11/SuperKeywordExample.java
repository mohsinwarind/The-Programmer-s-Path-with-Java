class Vehicle { 

    String type = "Vehicle"; // Field in the superclass 

    // Constructor in the superclass 
    Vehicle() { 
        System.out.println("Vehicle constructor called."); 
    } 

    // Method in the superclass 
    void start() { 
        System.out.println("Vehicle is starting."); 
    } 
} 

class Car extends Vehicle { 
    String type = "Car"; // Field in the subclass 

    // Constructor in the subclass 
    Car() { 
        super(); // Call the superclass constructor 
        System.out.println("Car constructor called."); 
    } 

    // Method in the subclass 
    void start() { 
        super.start(); // Call the superclass method 
        System.out.println("Car is starting."); 
    } 

    // Method to demonstrate access to fields 
    void printTypes() { 
        System.out.println("Type in Car class: " + type);         // Refers to the subclass field 
        System.out.println("Type in Vehicle class: " + super.type); // Refers to the superclass field 
    } 
} 

public class SuperKeywordExample { 
    public static void main(String[] args) { 
        Car myCar = new Car(); // Create an instance of Car 
        myCar.start();        // Call the start method 
        myCar.printTypes();   // Print the types of Vehicle and Car 
    } 
}
