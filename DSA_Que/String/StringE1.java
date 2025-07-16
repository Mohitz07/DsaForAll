package DSA_Que.String;
import java.util.*;
public class StringE1 {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[A-Za-z0-9]","");
        for(int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "ppaapp";
        System.out.println(isPalindrome(s));
    }
}
