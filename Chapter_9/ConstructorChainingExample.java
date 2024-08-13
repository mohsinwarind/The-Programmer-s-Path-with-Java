package Chapter_9;

class Person {
    String name;
    int age;

    // Constructor with two parameters
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor with one parameter, calls the two-parameter constructor
    Person(String name) {
        this(name, 0); // Calls the Person(String name, int age) constructor
    }

    // Default constructor, calls the one-parameter constructor
    Person() {
        this("Unknown"); // Calls the Person(String name) constructor
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorChainingExample {
    public static void main(String[] args) {
        Person p1 = new Person("Mohsin", 20); // Calls the two-parameter constructor
        p1.display(); // Outputs: Name: Mohsin, Age: 20

        Person p2 = new Person("Mohsin Ramzan"); // Calls the one-parameter constructor
        p2.display(); // Outputs: Name: Mohsin Ramzan, Age: 0

        Person p3 = new Person(); // Calls the default constructor
        p3.display(); // Outputs: Name: Unknown, Age: 0
    }
}

