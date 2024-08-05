public class ExplicitTypeCasting {
    public static void main(String[] args) {
        // Initializing a double
        double d = 100.04;

        // Explicit casting from double to long
        long l = (long) d;
        System.out.println("Double value: " + d);
        System.out.println("Long value (after casting): " + l);

        // Explicit casting from long to int
        int i = (int) l;
        System.out.println("Long value: " + l);
        System.out.println("Integer value (after casting): " + i);

        // Explicit casting from int to short
        short s = (short) i;
        System.out.println("Integer value: " + i);
        System.out.println("Short value (after casting): " + s);

        // Explicit casting from short to byte
        byte b = (byte) s;
        System.out.println("Short value: " + s);
        System.out.println("Byte value (after casting): " + b);

        // Explicit casting from float to int
        float f = 10.99f;
        int intFromFloat = (int) f;
        System.out.println("Float value: " + f);
        System.out.println("Integer value (after casting): " + intFromFloat);

        // Explicit casting from char to byte
        char c = 'A';
        byte byteFromChar = (byte) c;
        System.out.println("Char value: " + c);
        System.out.println("Byte value (after casting): " + byteFromChar);

        // Potential data loss example
        int largeInt = 130;
        byte smallByte = (byte) largeInt;
        System.out.println("Integer value: " + largeInt);
        System.out.println("Byte value (after casting): " + smallByte);
    }
}