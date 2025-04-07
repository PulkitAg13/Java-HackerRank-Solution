import java.util.Scanner;

public class Java_Loops_II {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int[] arr = new int[n];
            int term = a;
            for (int j = 0; j < n; j++) {
                term = term + (int)Math.pow(2, j) * b;
                arr[j] = term;  
            }
        
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j] + " ");
            }
            
            System.out.println();
        }
        
        in.close();
    }
}
