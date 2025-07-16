package DSA_Que.String;
import java.util.*;
public class StringE8 {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0, left = 0;
        for(int right = 0; right < s.length(); right++) {
            char currChar = s.charAt(right);
            if(map.containsKey(currChar)) {
                left = Math.max(map.get(currChar)+1, left);
            }
            map.put(currChar, right);
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
