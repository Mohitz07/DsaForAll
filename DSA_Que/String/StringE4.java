package DSA_Que.String;
import java.util.*;
public class StringE4 {
    public static String removeConsecutivechar(String str) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if(i == 0 || str.charAt(i-1) != str.charAt(i)) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "aabb";
        System.out.println(removeConsecutivechar(str));
    }
}
