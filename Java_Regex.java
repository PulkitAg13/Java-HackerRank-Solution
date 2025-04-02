import java.util.*;

class Java_Regex{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();

    }
}

//Write your code here
class MyRegex {
    String pattern = "^(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|0?[0-9]{1,2})\\."
                   + "(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|0?[0-9]{1,2})\\."
                   + "(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|0?[0-9]{1,2})\\."
                   + "(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|0?[0-9]{1,2})$";
}
