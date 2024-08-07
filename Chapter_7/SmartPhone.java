package Chapter_7;

public class SmartPhone {
    // Attributes
    String model;
    String brand;
    int storage;
    int ram;

    // Constructor
    public SmartPhone(String model, String brand, int storage, int ram) {
        this.model = model;
        this.brand = brand;
        this.storage = storage;
        this.ram = ram;
    }

    // Method
    void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Storage: " + storage + "GB");
        System.out.println("RAM: " + ram + "GB");
    }
    public static void main(String[] args) {
        // Creating smartphone objects using the Smartphone class (blueprint)
        SmartPhone phone1 = new SmartPhone("Galaxy S21", "Samsung", 128, 8);
        SmartPhone phone2 = new SmartPhone("iPhone 12", "Apple", 64, 4);

        // Displaying information about the smartphones
        phone1.displayInfo();
        phone2.displayInfo();
    }
    
    
}



