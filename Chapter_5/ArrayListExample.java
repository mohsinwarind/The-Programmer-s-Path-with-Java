import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList to store Integer elements
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Accessing elements from the ArrayList
        System.out.println("Element at index 2: " + numbers.get(2)); // Output: 30

        // Removing an element from the ArrayList
        numbers.remove(1); // Removes the element at index 1 (20)

        // Displaying all elements in the ArrayList
        System.out.println("ArrayList after removal: " + numbers);

        // Checking the size of the ArrayList
        System.out.println("Size of ArrayList: " + numbers.size()); // Output: 4

        // Iterating through the ArrayList
        System.out.print("Elements in ArrayList: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Clearing all elements from the ArrayList
        numbers.clear();
        System.out.println("ArrayList after clearing: " + numbers); // Output: []
        System.out.println("Is the ArrayList empty? " + numbers.isEmpty()); // Output: true
    }
}
