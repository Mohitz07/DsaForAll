package DSA_Que.String;
import java.util.*;
public class StringE6 {
    static final String[] KEYPAD = {
        "2", "22", "222",   // A, B, C
        "3", "33", "333",   // D, E, F
        "4", "44", "444",   // G, H, I
        "5", "55", "555",   // J, K, L
        "6", "66", "666",   // M, N, O
        "7", "77", "777", "7777", // P, Q, R, S
        "8", "88", "888",   // T, U, V
        "9", "99", "999", "9999"  // W, X, Y, Z
    };
    public static String printSequence(String input) {
        StringBuilder result = new StringBuilder();
        for(char ch : input.toUpperCase().toCharArray()) {
            if(ch == ' ') {
                result.append("0");
            } else if(ch >= 'A' && ch <= 'Z'){
                result.append(KEYPAD[ch - 'A']);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String input = "Hello";
        System.out.println(printSequence(input));
    }
}
