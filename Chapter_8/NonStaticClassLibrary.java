public class NonStaticClassLibrary { 

    // Static member of Library class 
    public static String libraryName = "City Central Library"; 

    // Non-static inner class 
    class Book { 

        // Attributes of Book class 
        public String title; 
        public String author; 

        // Method to display book information 
        public void displayBookInfo() { 
            System.out.println("Book Title: " + title); 
            System.out.println("Book Author: " + author); 
            System.out.println("Library Name: " + libraryName); // Accessing static member of Library 
        } 
    } 

    // Main method to run the program 
    public static void main(String[] args) { 
        // Create an instance of Library 
        NonStaticClassLibrary library = new NonStaticClassLibrary(); 

        // Create an instance of non-static inner class Book 
        Book book = library.new Book(); 
        book.title = "To Kill a Mockingbird"; 
        book.author = "Harper Lee"; 

        // Display information about the book 
        book.displayBookInfo(); 
    } 
}
