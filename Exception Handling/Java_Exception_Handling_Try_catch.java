import java.util.InputMismatchException;
import java.util.Scanner;

public class Java_Exception_Handling_Try_catch {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        try{
            int x = sc.nextInt();
            int y = sc.nextInt();
            int result = x / y;
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        sc.close();
    }
}
