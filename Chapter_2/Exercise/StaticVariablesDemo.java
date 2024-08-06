package Exercise;

public class StaticVariablesDemo {
    // Static variable
    static int staticVar = 100;
    
    public static void main(String[] args) {
        System.out.println("Static variable: " + staticVar);
        
        // Modify static variable
        staticVar = 200;
        System.out.println("Modified static variable: " + staticVar);
    }
}