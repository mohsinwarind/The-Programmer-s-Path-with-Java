public class ReturnExample { 
    public static void main(String[] args) { 
        for (int i = 1; i <= 5; i++) { 
            if (i == 3) { 
                System.out.println("Ending the Program..");
                return; // Ending the program 
            } 
            System.out.println("Count : " + i); 
        } 
    } 
}
