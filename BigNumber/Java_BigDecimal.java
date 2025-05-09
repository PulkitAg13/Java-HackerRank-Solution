package BigNumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Java_BigDecimal {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        //Write your code here
         Arrays.sort(s, (a, b) -> new BigDecimal(b).compareTo(new BigDecimal(a)));

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
