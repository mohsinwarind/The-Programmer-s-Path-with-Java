// Define a class named Car 
class Car { 
    // Attributes of the class (also known as fields or properties) 
    String brand; 
    String color; 
    int speed; 

    // Method to display the car's details 
    void displayDetails() { 
        System.out.println("Car Brand: " + brand); 
        System.out.println("Car Color: " + color); 
        System.out.println("Car Speed: " + speed + " km/h"); 
    } 
} 

// The main class where execution begins 
public class Main { 
    public static void main(String[] args) { 
        // Creating an object of the Car class 
        Car myCar = new Car(); 

        // Setting the properties of the car object 
        myCar.brand = "Tesla"; 
        myCar.color = "Red"; 
        myCar.speed = 150; 

        // Displaying the details of the car object 
        myCar.displayDetails(); 
    } 
}