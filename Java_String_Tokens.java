import java.util.Scanner;

public class Java_String_Tokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        
        s = s.trim();

        
        if (s.isEmpty()) {  
            System.out.println(0);
        }
        else {
            String[] tokens = s.split("[^A-Za-z]+");
         System.out.println(tokens.length);
         
         for (String token : tokens) {
            System.out.println(token);
         }
        }
        
        scan.close();
    }
}
