import java.util.Scanner;

public class Java_Strings_Introduction {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int length_A = A.length();
        int length_B = B.length();
        int sum = length_A + length_B;
        System.out.println(sum);
        
        int A_lexi_B = A.compareTo(B);
        if (A_lexi_B > 0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        
        String cap_A = A.substring(0, 1).toUpperCase() + A.substring(1);
        String cap_B = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(cap_A + " " + cap_B);
        
        sc.close();
    }
}