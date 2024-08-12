class Smartphone {

    // Attributes of Smartphone
    String brand;
    String model;

    // Method to display smartphone details
    void displayDetails() {
        System.out.println("Smartphone Brand: " + brand);
        System.out.println("Smartphone Model: " + model);
    }
}

class Camera {

    // Attribute of Camera
    int resolution;

    // Method to simulate taking a picture
    void takePicture() {
        System.out.println("Taking a picture with " + resolution + "MP camera.");
    }
}

class Battery {

    // Attribute of Battery
    int capacity;

    // Method to display battery status
    void displayBatteryStatus() {
        System.out.println("Battery capacity: " + capacity + "mAh");
    }
}

public class MultipleClassesExample {

    // Main method to run the program
    public static void main(String[] args) {
        // Create an instance of Smartphone
        Smartphone myPhone = new Smartphone();
        myPhone.brand = "TechBrand";
        myPhone.model = "X200";

        // Display smartphone details
        myPhone.displayDetails();

        // Create an instance of Camera
        Camera myCamera = new Camera();
        myCamera.resolution = 48; // Set camera resolution

        // Take a picture
        myCamera.takePicture();

        // Create an instance of Battery
        Battery myBattery = new Battery();
        myBattery.capacity = 4500; // Set battery capacity

        // Display battery status
        myBattery.displayBatteryStatus();
    }
}
