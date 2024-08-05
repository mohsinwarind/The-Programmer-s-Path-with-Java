public class ImplicitTypeCasting {
    public static void main(String[] args) {
        // Initializing an integer
        int i = 100;
        
        // Implicit casting from int to long
        long l = i;
        
        // Implicit casting from long to float
        float f = l;
        
        // Implicit casting from float to double
        double d = f;
        
        // Implicit casting from char to int
        char c = 'A';
        int charToInt = c;

        // Printing all the values
        System.out.println("Integer value: " + i);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);
        System.out.println("Char value: " + c);
        System.out.println("Char to int value: " + charToInt);
    }
}
