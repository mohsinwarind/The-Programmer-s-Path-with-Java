public class ContinueExample { 
    public static void main(String[] args) { 
        for (int i = 1; i <= 5; i++) { 
            if (i == 3) {
                System.out.println("Skipping 3.. "); 
                continue; // Skip the third count 
            } 
            System.out.println("Count : " + i); 
        } 
    } 
}
