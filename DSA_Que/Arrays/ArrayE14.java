package DSA_Que.Arrays;
import java.util.*;
public class ArrayE14 {
    public static int findMinInRSArray(int[] arr) {
        int st = 0;
        int end = arr.length-1;
        while(st < end) {
            int mid = st+(end-st)/2;
        
            //check which half is sorted
            if(arr[mid] > arr[end]) {
                st = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return arr[st];
    }
    public static void main(String[] args) {
        int arr[] = {7, 9, 1, 3, 5};
        System.out.println(findMinInRSArray(arr));
    }
}
