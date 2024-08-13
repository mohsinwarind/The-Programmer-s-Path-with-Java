package Chapter_9;

class Example { 

    int value; 


    // No-argument constructor 

    Example() { 

        value = 42; // Assigning a default value 

    } 

} 

 

public class NoArgumentConstructorExample { 

    public static void main(String[] args) { 

        Example obj = new Example(); // No-argument constructor is called 

        System.out.println("Value: " + obj.value); // Outputs: 42 

    } 

} 