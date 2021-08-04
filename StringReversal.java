import java.util.Scanner;

public class StringReversal {
    public static void main (String[]arg){
        Scanner Scan = new Scanner (System.in);
        System.out.print("Please Enter a String: ");
        String s = Scan.next();
        System.out.println("The Reverse String is: " + reverseString(s));

    }
    public static String reverseString(String s){
        if(s==null || s.length()<=1){
            return s;
        }
        return reverseString(s.substring(1))+s.charAt(0);
    }
}
