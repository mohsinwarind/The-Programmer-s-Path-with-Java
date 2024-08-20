// Superclass
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

// Subclass
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting");
    }
}

// Another Subclass
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting");
    }
}

public class MethodOveridingExample {
    public static void main(String[] args) {
        // Creating objects
        Vehicle myVehicle = new Vehicle();
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();
        
        // Calling start method
        myVehicle.start(); // Calls method in Vehicle class
        myCar.start();     // Calls overridden method in Car class
        myBike.start();    // Calls overridden method in Bike class
    }
}
