// Abstract class
abstract class Vehicle {
    String name;

    // Constructor
    Vehicle(String name) {
        this.name = name;
    }

    // Concrete method
    void start() {
        System.out.println(name + " is starting.");
    }

    // Concrete method
    void stop() {
        System.out.println(name + " is stopping.");
    }

    // Abstract method
    abstract void operate();
}

// Subclass 1
class Car extends Vehicle {

    // Constructor
    Car(String name) {
        super(name);
    }

    // Implementing the abstract method
    void operate() {
        System.out.println(name + " is driving on the road.");
    }
}

// Subclass 2
class Boat extends Vehicle {

    // Constructor
    Boat(String name) {
        super(name);
    }

    // Implementing the abstract method
    void operate() {
        System.out.println(name + " is sailing in the water.");
    }
}

public class AbstractClassesExample {
    public static void main(String[] args) {
        // Create objects of Car and Boat
        Vehicle myCar = new Car("Honda");
        Vehicle myBoat = new Boat("Yacht");

        // Call methods on Car object
        myCar.start();
        myCar.operate();
        myCar.stop();

        // Call methods on Boat object
        myBoat.start();
        myBoat.operate();
        myBoat.stop();
    }
}
