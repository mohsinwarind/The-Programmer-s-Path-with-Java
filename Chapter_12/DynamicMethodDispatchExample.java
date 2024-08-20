class Animal {
    // Method in superclass
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overridden method in subclass
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overridden method in subclass
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class DynamicMethodDispatchExample {
    public static void main(String[] args) {
        Animal myAnimal;

        // Reference of type Animal but object of type Dog
        myAnimal = new Dog();
        myAnimal.makeSound(); // Outputs: Dog barks

        // Reference of type Animal but object of type Cat
        myAnimal = new Cat();
        myAnimal.makeSound(); // Outputs: Cat meows
    }
}

