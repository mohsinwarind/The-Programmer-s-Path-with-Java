class Smartphone {
    // Private attributes
    private String brand;
    private double price;

    // Getter method for brand
    public String getBrand() {
        return this.brand;
    }

    // Setter method for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter method for price
    public double getPrice() {
        return this.price;
    }

    // Setter method for price
    public void setPrice(double price) {
        // Validation: Ensure price is not negative
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }
}

public class GetterSetterExample {
    public static void main(String[] args) {
        // Create a Smartphone object
        Smartphone phone = new Smartphone();

        // Set values using setter methods
        phone.setBrand("Samsung");
        phone.setPrice(999.99);

        // Get values using getter methods
        System.out.println("Brand: " + phone.getBrand()); // Outputs: Samsung
        System.out.println("Price: $" + phone.getPrice()); // Outputs: 999.99

        // Attempt to set an invalid price
        phone.setPrice(-500); // Outputs: Price cannot be negative.
    }
}
