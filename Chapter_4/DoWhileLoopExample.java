public class DoWhileLoopExample {
    public static void main(String[] args) {
        int number = 1; // Initialization

        do {
            System.out.println("Count : " + number); // Code to be executed
            number++; // Update
        } while (number <= 5); // Condition
        System.out.println("We are out...");
        System.out.println("Number is  "+number);
    }
}

