class Superclass {
    static void display() {
        System.out.println("Static method in Superclass");
    }
}

class Subclass extends Superclass {
    static void display() {
        System.out.println("Static method in Subclass");
    }
}

public class MethodHidingExample {
    public static void main(String[] args) {
        Superclass obj = new Subclass();
        obj.display(); // Calls Superclass's static method

        Subclass.display(); // Calls Subclass's static method
        Superclass.display(); // Calls Superclass's static method
    }
}
