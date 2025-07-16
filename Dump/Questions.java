package Dump;
import java.util.*;
public class Questions {
    private static void reverse(int[] arr, int start, int end) {    //TC = O(n) | SC = O(1)
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //1.rotate array
    public static void rotateArr(int[] arr, int k) {    //TC = O(n) | SC = O(1)
        int n = arr.length;
        int d = k % n;

        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }

    //2.Largest Element in array
    public static int largestElement(int[] arr) {   //TC = O(n) | SC = O(1)
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) 
                max = arr[i];
        }
        return max;
    }

    //3.Max Subarray (This will work for negative numbers also)
    public static int maxSubArray(int[] arr) {      //TC = O(n) | SC = O(1)
        int ms = arr[0];
        int cs = arr[0];

        for(int i = 1; i < arr.length; i++) {
            cs = Math.max(arr[i], cs+arr[i]);
            ms = Math.max(cs, ms);
        }
        return ms;
    }

    //4.Contains Duplicate
    public static boolean containsDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr) {
            if(set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }

    //Print duplicates
    public static void printDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        for(int num : arr) {
            if(set.contains(num)) {
                duplicate.add(num);
            } else {
                set.add(num);
            }
        }
        if(duplicate.isEmpty()) {
            System.out.println("No Duplicate Found!!!");
            return;
        }
        for(int dup : duplicate) {
            System.out.println(dup+" ");
        }
    }

    //5.Chocolate Distribution
    public static int findMinDiff(ArrayList<Integer> arr1, int k) {
        // your code here
        int result = Integer.MAX_VALUE;
        if(arr1.size() == 0 || arr1 == null || k == 0 || k > arr1.size()) {
            return 0;
        }
        Collections.sort(arr1);
        
        for(int i = 0; i <= arr1.size()-k; i++) {
            int currDiff = arr1.get(i+k-1) - arr1.get(i);
            result = Math.min(result, currDiff);
        }
        return result;
    }
    public static int searchInRotatedSorted(int[] arr, int key) {
        int start = 0, end = arr.length-1;
        while(start <= end) {
            int mid = start+(end-start)/2;
            if(arr[mid] == key) {
                return mid;
            }
            if(arr[start] <= arr[mid]) {    //left is Sorted
                if(arr[start] <= key && arr[mid] >= key) {
                    end = mid-1;
                } 
                else {
                    start = mid+1;
                }
            }
            else {
                if(arr[mid] <= key && arr[end] >= key) {
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    //Find the next permutation
    public static void nextPermutation(int[] arr) {
        int idx = -1;
        int n = arr.length;
        
        for(int i = n-2; i >= 0; i--) {
            if(arr[i] < arr[i+1]) {
                idx = i;
                break;  //BREAK STATEMENT IS VERY IMPORTANT
            }
        }
        if(idx == -1) {
            reverse(arr, 0, n-1);
            return;
        }
        for(int i = n-1; i >= 0; i--) {
            if(arr[idx] < arr[i]) {
                //swap
                swap(arr, idx, i);
                break;  //BREAK STATEMENT IS VERY IMPORTANT
            }
        }
        reverse(arr, idx+1, n-1);
        
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //int k = 2;
        printArray(arr);
        
        //rotateArr(arr, k);

        //System.out.println(largestElement(arr));

        //System.out.println(maxSubArray(arr));
        
        //System.out.println(containsDuplicate(arr));

        //printDuplicate(arr);

        // ArrayList<Integer> arr1 = new ArrayList<>();
        // int k = 5;
        // arr1.add(3);
        // arr1.add(4);
        // arr1.add(1);
        // arr1.add(9);
        // arr1.add(56);
        // arr1.add(7);
        // arr1.add(9);
        // arr1.add(12);

        //System.out.println(findMinDiff(arr1, k));

        //6.
        //System.out.println(searchInRotatedSorted(arr, 4));

        //7. Next Permutation
        nextPermutation(arr);
        printArray(arr);

    }
}
