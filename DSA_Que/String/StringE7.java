package DSA_Que.String;
import java.util.*;
public class StringE7 {
    public static void printDuplicateOccurrence(String str) {
        Map<Character, Integer> map = new HashMap<>();
        //count occurence of each character
        for(char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        System.out.println("Duplicate Character : ");
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1) 
                System.out.println(entry.getKey()+" >> "+entry.getValue()+" times");
        }
    }
    public static void main(String[] args) {
        String str = "programming";
        printDuplicateOccurrence(str);
    }
}
