import java.util.Scanner;

public class Java_End_Of_File {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1;
        
        while (scanner.hasNextLine()) {
            System.out.println(lineNumber + " " + scanner.nextLine());
            lineNumber++;
        }
        
        scanner.close();
    }
}
