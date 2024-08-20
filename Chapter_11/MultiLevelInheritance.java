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

// Subclass of Dog 
class Puppy extends Dog { 
    void weep() { 
        System.out.println("Puppy is weeping"); 
    } 
} 

public class MultiLevelInheritance { 
    public static void main(String[] args) { 
        Puppy myPuppy = new Puppy(); 
        myPuppy.eat();  // Inherited from Animal 
        myPuppy.bark(); // Inherited from Dog 
        myPuppy.weep(); // Defined in Puppy 
    } 
}
