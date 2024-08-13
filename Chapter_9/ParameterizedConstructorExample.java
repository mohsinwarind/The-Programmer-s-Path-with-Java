package Chapter_9;

class Example { 

    int value; 

     

    // Parameterized constructor 

    Example(int v) { 

        value = v; 

    } 

} 

 

public class ParameterizedConstructorExample { 

    public static void main(String[] args) { 

        Example obj = new Example(100); // Parameterized constructor is called 

        System.out.println("Value: " + obj.value); // Outputs: 100 

    } 

} 

 