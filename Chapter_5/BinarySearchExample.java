public class BinarySearchExample {
    public static void main(String[] args) {
        // Initialize a sorted array of integers
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        // Set the target value to search for
        int target = 7;

        // Initialize low and high indices
        int low = 0;
        int high = arr.length - 1;

        // Variable to store the index of the target element
        int index = -1; // Default value -1 means not found

        // Perform binary search
        while (low <= high) {
            // Calculate the middle index
            int mid = (low + high) / 2;

            // Check if the target is present at mid
            if (arr[mid] == target) {
                index = mid; // If found, store the index
                break; // Exit the loop as the target is found
            }

            // If the target is greater, ignore the left half
            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                // If the target is smaller, ignore the right half
                high = mid - 1;
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
