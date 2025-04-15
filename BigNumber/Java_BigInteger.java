package BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class Java_BigInteger {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        // Read the two large numbers as strings
        BigInteger A = new BigInteger(scanner.next());
        BigInteger B = new BigInteger(scanner.next());

        // Perform addition and multiplication
        BigInteger sum = A.add(B);
        BigInteger product = A.multiply(B);

        // Print results
        System.out.println(sum);
        System.out.println(product);

        scanner.close();
    }
}
