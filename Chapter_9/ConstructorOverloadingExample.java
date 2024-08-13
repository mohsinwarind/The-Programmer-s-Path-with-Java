package Chapter_9;
class Person {

    String name;
    int age;

    // Default constructor
    Person() {
        name = "Unknown";
        age = 0;
    }

    // Constructor with one parameter (name)
    Person(String name) {
        this.name = name;
        age = 0; // default age
    }

    // Constructor with two parameters (name and age)
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorOverloadingExample {

    public static void main(String[] args) {
        // Using the default constructor
        Person person1 = new Person();
        person1.display(); // Outputs: Name: Unknown, Age: 0

        // Using the constructor with one parameter
        Person person2 = new Person("Mohsin");
        person2.display(); // Outputs: Name: Mohsin, Age: 0

        // Using the constructor with two parameters
        Person person3 = new Person("Mohsin Ramzan", 20);
        person3.display(); // Outputs: Name: Mohsin Ramzan, Age: 20
    }
}
