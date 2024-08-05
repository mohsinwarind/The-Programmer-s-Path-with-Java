public class AgeCategorizer {
    public static void main(String[] args) {
        int age = 25; // Example age

        if (age < 13) {
            System.out.println("You are a child.");
        } else if (age >= 13 && age < 20) {
            System.out.println("You are a teenager.");
        } else if (age >= 20 && age < 60) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior.");
        }
    }
}
