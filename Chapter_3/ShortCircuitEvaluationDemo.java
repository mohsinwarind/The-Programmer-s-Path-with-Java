public class ShortCircuitEvaluationDemo {

    public static void main(String[] args) {
        // Variables for demonstration
        boolean a = true;
        boolean b = false;
        boolean c = false;

        // Short-circuit AND (&&) with multiple operands
        System.out.println("Short-circuit AND (&&) with multiple operands:");
        boolean resultAnd = a && (b = true) && (c = true);
        System.out.println("a && (b = true) && (c = true): " + resultAnd); // Expected: false
        System.out.println("b: " + b + ", c: " + c); // b: true, c: true

        // Reset b and c for the next test
        b = false;
        c = false;

        // Short-circuit OR (||) with multiple operands
        System.out.println("\nShort-circuit OR (||) with multiple operands:");
        boolean resultOr = a || (b = true) || (c = true);
        System.out.println("a || (b = true) || (c = true): " + resultOr); // Expected: true
        System.out.println("b: " + b + ", c: " + c); // b: false, c: false
    }
}

