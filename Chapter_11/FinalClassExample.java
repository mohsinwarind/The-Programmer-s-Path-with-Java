// Declaring a final class
final class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Attempting to extend the final class will result in a compilation error
// class Car extends Vehicle {
//     // Error: cannot inherit from final 'Vehicle'
// }

public class FinalClassExample {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle("Toyota");
        myVehicle.displayBrand(); // Output: Brand: Toyota
    }
}
