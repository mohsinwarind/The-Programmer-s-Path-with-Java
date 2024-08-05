public class ThreeDimensionalArrayExample { 
    public static void main(String[] args) { 
        // Declaration and initialization 
        String[][][] bookshelf = { 
            {   // Shelf 1 
                {"Book1A", "Book1B", "Book1C"}, 
                {"Book1D", "Book1E", "Book1F"}, 
                {"Book1G", "Book1H", "Book1I"} 
            }, 
            {   // Shelf 2 
                {"Book2A", "Book2B", "Book2C"}, 
                {"Book2D", "Book2E", "Book2F"}, 
                {"Book2G", "Book2H", "Book2I"} 
            } 
        }; 

        // Printing the 3D array 
        for (int shelf = 0; shelf < bookshelf.length; shelf++) { 
            System.out.println("_________Shelf " + (shelf + 1) + "________________"); 
            System.out.println();
            for (int row = 0; row < bookshelf[shelf].length; row++) { 
                for (int col = 0; col < bookshelf[shelf][row].length; col++) { 
                    System.out.print(bookshelf[shelf][row][col] + " | "); 
                } 
                System.out.println(); 
            } 
            System.out.println("__________________________"); 
            System.out.println(); 
        } 
    } 
} 
