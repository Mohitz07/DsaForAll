package DSA_Que.Arrays;
import java.util.*;
public class ArrayE7 {
    public static void nextPermutation(int arr[]) {
        //1. find breaking point 
        int idx = -1;
        for (int i = arr.length-2; i >= 0; i--) {
            if(arr[i] < arr[i+1]) {
                idx = i;
                break;
            }
        }
        if(idx == -1) {
            //reverse array
            reverse(arr, 0, arr.length-1);
            return;
        }

        //2. swap where arr[i] > arr[idx] from end
        for (int i = arr.length-1; i > idx; i--) {
            if(arr[i] > arr[idx]){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp; 
                break;
            }
        }

        //3. Reverse the array after idx+1
        reverse(arr, idx+1, arr.length-1);


    }
    public static void reverse(int arr[], int start, int end) {
        int temp;
        while(start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 4, 3, 0, 0};
        nextPermutation(arr);
        printArray(arr);
    }
}
