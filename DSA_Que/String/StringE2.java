package DSA_Que.String;
import java.util.*;
public class StringE2 {
    /*An Anagram is a word or phrase formed by rearranging
     the letters of a different word or phrase, using all the original letters exactly once.*/
    public static boolean isAnagram(String s1, String s2) {
        char string1[] = s1.toCharArray();
        char string2[] = s2.toCharArray();

        Arrays.sort(string1);
        Arrays.sort(string2);

        return Arrays.equals(string1, string2);
    }
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";
        System.out.println(isAnagram(s1, s2));
    }
}
