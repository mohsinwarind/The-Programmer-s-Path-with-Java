package Chapter_9;
class Person {
    String name;
    int age;

    // Constructor with parameters having the same names as instance variables
    Person(String name, int age) {
        this.name = name; // 'this.name' refers to the instance variable
        this.age = age;   // 'this.age' refers to the instance variable
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ThisKeywordExample {
    public static void main(String[] args) {
        Person person = new Person("Mohsin", 20);
        person.display(); // Outputs: Name: Mohsin, Age: 20
    }
}
