class Animal { 
    String name; 

    // Constructor in the superclass with a parameter 
    Animal(String name) { 
        this.name = name; 
    } 

    // Method in the superclass with a parameter 
    void makeSound(String sound) { 
        System.out.println(name + " makes a sound: " + sound); 
    } 
} 

class Dog extends Animal { 
    String breed; 

    // Constructor in the subclass with parameters 
    Dog(String name, String breed) { 
        super(name); // Pass the 'name' parameter to the superclass constructor 
        this.breed = breed; 
    } 

    // Method in the subclass with a parameter 
    void displayDetails() { 
        System.out.println("Name: " + super.name); 
        System.out.println("Breed: " + breed); 
        // Calling the superclass method with a parameter 
        super.makeSound("Woof Woof"); 
    } 
} 

public class SuperWithParametersExample { 
    public static void main(String[] args) { 
        // Create an instance of Dog and pass parameters 
        Dog myDog = new Dog("Buddy", "Golden Retriever"); 
        // Display the dog's details 
        myDog.displayDetails(); 
    } 
}
