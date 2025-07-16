package DSA_Que.HeapsAndHashing;
import java.util.*;

//Choose m elements having minimum difference between max and min
public class E1 {
    public static int diff(int[] arr, int m) {
        int n = arr.length;
        if(n < m) {
            return -1;
        }
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        for(int i = 0; i+m-1 < n; i++) {
            int diff = arr[i+m-1] - arr[i];
            if(minDiff > diff) {

                minDiff = diff;
            }
        }
        return minDiff;
    }
    public static void main(String[] args) {
        int arr[] = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;
        System.out.println(diff(arr, m));
    }
}
