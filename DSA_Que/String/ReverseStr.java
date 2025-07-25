package DSA_Que.String;
public class ReverseStr {
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        
        for(int i = 0; i < str.length()/2; i++) {
            int front = i;
            int back = str.length()-i-1;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "Mohit";
        System.out.println(reverseString(str));
    }
}
