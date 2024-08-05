public class SequentialSearchExample {
    public static void main(String[] args) {
        // Initialize the array of integers
        int[] arr = {1, 3, 5, 7, 9};

        // Set the target value to search for
        int target = 5;

        // Variable to store the index of the target element
        int index = -1; // Default value -1 means not found

        // Loop through the array to perform the search
        for (int i = 0; i < arr.length; i++) {
            // Compare each element with the target value
            if (arr[i] == target) {
                index = i; // If found, store the index
                break; // Exit the loop as the target is found
            }
        }

        // Check the result and print the appropriate message
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
