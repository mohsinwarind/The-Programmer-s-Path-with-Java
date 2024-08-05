public class LogicalOperatorsDemo {

    public static void main(String[] args) {
        // Variables for demonstration
        boolean a = true;
        boolean b = false;
        boolean c = true;
   
        

        
      
        
        
        
        
        
        




        
        
      
        
        
        
        
        
        




        // Logical AND (&&) demonstration
        System.out.println("Logical AND (&&) demonstration:");
        System.out.println("a && b: " + (a && b)); // false
        System.out.println("a && c: " + (a && c)); // true

        // Logical OR (||) demonstration
        System.out.println("\nLogical OR (||) demonstration:");
        System.out.println("a || b: " + (a || b)); // true
        System.out.println("b || c: " + (b || c)); // true

        // Logical NOT (!) demonstration
        System.out.println("\nLogical NOT (!) demonstration:");
        System.out.println("!a: " + !a); // false
        System.out.println("!b: " + !b); // true

        // Short-circuit evaluation demonstration
        System.out.println("\nShort-circuit evaluation demonstration:");
        System.out.println("a && (b = true): " + (a && (b = true))); // true, b is set to true
        System.out.println("b after evaluation: " + b); // true
        b = false; // reset b
        System.out.println("a || (b = true): " + (a || (b = true))); // true, b is not evaluated
        System.out.println("b after evaluation: " + b); // false

        // Using logical operators in control flow statements
        System.out.println("\nUsing logical operators in control flow statements:");
        if (a && c) {
            System.out.println("Both a and c are true.");
        }

        while (a || b) {
            System.out.println("At least one of a or b is true.");
            // Breaking the loop to avoid infinite loop
            break;
        }
    }
}





