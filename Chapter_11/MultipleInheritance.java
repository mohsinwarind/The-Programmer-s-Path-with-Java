// Interface 1 
interface Canine { 
    void bark(); 
} 

// Interface 2 
interface Pet { 
    void play(); 
} 

// Class implementing multiple interfaces 
class Dog implements Canine, Pet { 
    public void bark() { 
        System.out.println("Dog is barking"); 
    } 

    public void play() { 
        System.out.println("Dog is playing"); 
    } 
} 

public class MultipleInheritance { 
    public static void main(String[] args) { 
        Dog myDog = new Dog(); 
        myDog.bark(); // Implemented from Canine 
        myDog.play(); // Implemented from Pet 
    } 
}
