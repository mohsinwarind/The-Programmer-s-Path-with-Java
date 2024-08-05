public class AnimalCategorizer {
    public static void main(String[] args) {
        String type = "mammal"; // Example type
        String size = "large";  // Example size

        if (type.equals("mammal")) {
            if (size.equals("small")) {
                System.out.println("This is a small mammal, like a rabbit.");
            }
            if (size.equals("large")) {
                System.out.println("This is a large mammal, like an elephant.");
            }
        }

        if (type.equals("reptile")) {
            if (size.equals("small")) {
                System.out.println("This is a small reptile, like a gecko.");
            }
            if (size.equals("large")) {
                System.out.println("This is a large reptile, like a crocodile.");
            }
        }
    }
}
