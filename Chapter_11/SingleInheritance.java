// Superclass 
class Animal { 
    void eat() { 
        System.out.println("Animal is eating"); 
    } 
} 

// Subclass 
class Dog extends Animal { 
    void bark() { 
        System.out.println("Dog is barking"); 
    } 
} 

public class SingleInheritance { 
    public static void main(String[] args) { 
        Dog myDog = new Dog(); 
        myDog.eat();  // Inherited from Animal 
        myDog.bark(); // Defined in Dog 
    } 
}
