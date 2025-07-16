package DSA_Que.Arrays;
import java.util.*;
public class ArrayE15 {
    public static boolean twoSum(int arr[], int target) {
        int left = 0; 
        int right = arr.length-1;
        Arrays.sort(arr);
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target) {
                return true;
            }
            else if(sum < target) {
                left++;
            }
            else
                right--;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {7, 9, 1, 3, 5};
        int target = 6;
        System.out.println(twoSum(arr, target));
    }
}
