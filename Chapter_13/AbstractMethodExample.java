// Abstract class representing an Animal

abstract class Animal { 

    // Abstract method (no body)

    abstract void makeSound(); 

    // Regular method (with body)

    void eat() { 
        System.out.println("This animal eats food."); 
    } 
} 

// Subclass representing a Dog

class Dog extends Animal { 

    // Providing implementation of the abstract method

    void makeSound() { 
        System.out.println("The dog barks: Woof Woof!"); 
    } 
} 

// Subclass representing a Cat

class Cat extends Animal { 

    // Providing implementation of the abstract method

    void makeSound() { 
        System.out.println("The cat meows: Meow Meow!"); 
    } 
}

public class AbstractMethodExample { 

    public static void main(String[] args) { 

        Animal myDog = new Dog(); 
        Animal myCat = new Cat(); 

        // Call the abstract method which is implemented by the subclasses

        myDog.makeSound();  // Output: The dog barks: Woof Woof! 
        myCat.makeSound();  // Output: The cat meows: Meow Meow! 

        // Call the non-abstract method from the abstract class

        myDog.eat();  // Output: This animal eats food. 
        myCat.eat();  // Output: This animal eats food. 
    } 
} 
