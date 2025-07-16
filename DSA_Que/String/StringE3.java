package DSA_Que.String;
import java.util.*;
public class StringE3 {
    public static boolean validParenthesis(String str) {
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()) {
            if(c == '(') {
                stack.push(')');
            }
            else if(c == '[') {
                stack.push(']');
            }
            else if(c == '{') {
                stack.push('}');
            }
            else if(str.isEmpty() || stack.pop() != c) {    //stack.pop if it is not equal
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String str = "()[]{}";
        System.out.println(validParenthesis(str));
    }
}
