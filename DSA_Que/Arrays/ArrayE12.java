package DSA_Que.Arrays;

//Product of Array Except Self
import java.util.*;

public class ArrayE12 {
    //brute force method TC=O(n^2)

    public static int[] method1(int arr[]){
        int answer[] = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            answer[i] = 1;  // Initialized to 1 for multiplication
            for(int j=0; j<arr.length; j++) {
                if(i != j) {
                    answer[i] *= arr[j];
                }
            }
        }
        return answer;
    }

    //Optimized technique TC=O(n) SC=O(1)
    public static int[] method2(int arr[]) {
        int n = arr.length;
        int answer[] = new int[n];
        
        answer[0] = 1;
        for(int i=1; i<n; i++) {
            answer[i] = answer[i-1] * arr[i-1];
        }
        int suffix = 1;
        for(int i=n-2; i>=0; i--) {
            suffix *= arr[i+1];
            answer[i] *= suffix; 
        }
        return answer;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        //System.out.println(Arrays.toString(method1(arr)));
        System.out.println(Arrays.toString(method2(arr)));
    }
}
