package DSA_Que.Arrays;
import java.util.*;
//Reverse an Array
public class ArrayE2 {
    public static void getReverse(int arr[]){   //Time = O(n) Space = O(n) due to additional space
        for(int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void getreverse2(int arr[], int start, int end){ //Time = O(n) Space = O(1)
        int temp;
        while (start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,5,3,7,8,5};
        getReverse(arr);
        //getreverse2(arr, 0, arr.length-1);
        printArray(arr);
    }
}
