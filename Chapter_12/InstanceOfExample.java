class Animal {
    // Animal class definition
}

class Dog extends Animal {
    // Dog class definition
}

class Cat extends Animal {
    // Cat class definition
}

public class InstanceOfExample {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        
        // Check if myAnimal is an instance of Dog
        if (myAnimal instanceof Dog) {
            System.out.println("myAnimal is an instance of Dog");
        }
        
        // Check if myAnimal is an instance of Animal
        if (myAnimal instanceof Animal) {
            System.out.println("myAnimal is an instance of Animal");
        }
        
        // Check if myAnimal is an instance of Cat
        if (myAnimal instanceof Cat) {
            System.out.println("myAnimal is an instance of Cat");
        } else {
            System.out.println("myAnimal is not an instance of Cat");
        }
    }
}
