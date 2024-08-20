class Smartphone { 

    // Private fields representing the internal components 
    private String processor; 
    private int batteryLevel; 

    // Constructor to initialize the smartphone with its components 
    public Smartphone(String processor) { 
        this.processor = processor; 
        this.batteryLevel = 100; // Battery is fully charged 
    } 

    // Public method to make a call 
    public void makeCall(String number) { 
        if (batteryLevel > 0) { 
            System.out.println("Calling " + number + "..."); 
            batteryLevel -= 10; // Using some battery 
        } else { 
            System.out.println("Battery is dead. Please charge your phone."); 
        } 
    } 

    // Public method to check the battery level 
    public void checkBattery() { 
        System.out.println("Battery level: " + batteryLevel + "%"); 
    } 
} 

public class EncapsulationExample { 

    public static void main(String[] args) { 
        // Create a new Smartphone object 
        Smartphone myPhone = new Smartphone("Snapdragon 888"); 

        // Directly accessing the processor attribute 
        // myPhone.processor    
        // This will throw an error, which is why it is commented out. You can’t directly access it. 

        // Use the public interface to interact with the smartphone 
        myPhone.makeCall("123-456-7890"); 
        myPhone.checkBattery(); 
    } 
}

