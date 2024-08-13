package Chapter_9;

class Example { 

    int value; 

     

    // Default constructor is provided by the compiler 

} 

 

public class DefaulConstructorExample { 

    public static void main(String[] args) { 

        Example obj = new Example(); // Default constructor is called 

        System.out.println("Value: " + obj.value); // Outputs: 0 

    } 

} 