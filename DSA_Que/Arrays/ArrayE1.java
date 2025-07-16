package DSA_Que.Arrays;
import java.util.*;

//Maximum and minimum of an array using minimum number of comparision.
public class ArrayE1 {
    public static void getMinMax(int arr[]) {  //Time Complexity O(nlogn) Space O(1) 
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];
        System.out.println("Min value : "+min+ " Max value : "+max); 
    }


    public static void main(String[] args) {
        int arr[] = {3, 5, 4, 1, 9};
        int n = arr.length;
        getMinMax(arr);

        //System.out.println("Min value of Array is "+getMin(arr, n)+" And Max value of Array is "+getMax(arr, n));
    }
//-----------------------------------------------------------------------------------------------------------------------//
        //Another approach  Time Complexity is O(n)
        public static int getMin(int arr[], int n){
            int min = Integer.MAX_VALUE;
            for(int i=0; i<n; i++){
                if(arr[i] < min){
                    min = arr[i];
                }
            }
            return min;
        }
        public static int getMax(int arr[], int n){
            int max = Integer.MIN_VALUE;
            for(int i=0; i<n; i++){
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            return max;
        }
}
    