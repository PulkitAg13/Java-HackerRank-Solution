import java.util.Scanner;

public class Java_Anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        
         if (a.length() != b.length()) {
            return false;
        }
        
        String small_a = a.toLowerCase();
        String small_b = b.toLowerCase();
        
        char[] arr_a = small_a.toCharArray();
        char[] arr_b = small_b.toCharArray();
        
        sortCharArray(arr_a);
        sortCharArray(arr_b);
        
        for (int i = 0; i < arr_a.length; i++) {
            if (arr_a[i] != arr_b[i]) {
                return false;
            }
        }
        return true;
    }
    
    static void sortCharArray(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

