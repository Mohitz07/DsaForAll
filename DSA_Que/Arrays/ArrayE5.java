package DSA_Que.Arrays;
import java.util.*;
public class ArrayE5 {
    public static int chocolateDistribution(int[] arr, int m) {
        if(arr.length == 0) {
            return 0;
        }
        Arrays.sort(arr);
        int temp = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length-m+1; i++) {
            int minElement = arr[i];
            int maxElement = arr[i+m-1];
            temp = Math.min(temp, maxElement-minElement);
        }
        return temp;
    }

    public static void main(String[] args) {
        int arr[] = {7, 3, 2, 4, 9, 12, 56};
        int m = 5;
        System.out.println(chocolateDistribution(arr, m));
    }
    
}
