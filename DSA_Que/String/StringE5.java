package DSA_Que.String;
import java.util.*;
public class StringE5 {
    public static String longestConsecutivePrifix(String[] str) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(str);

        //get the first and last string
        char[] first = str[0].toCharArray();
        char[] last = str[str.length-1].toCharArray();

        for(int i = 0; i < str.length; i++) {
            if(first[i]!=last[i]) {
                break;
            }
            result.append(first[i]);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.println(longestConsecutivePrifix(str));
    }
}
