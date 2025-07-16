package DSA_Que.Arrays;

public class ArrayE6 {
    public static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {

            int mid = start+(end-start)/2;

            if(arr[mid] == target) {
                return mid;
            }
            if(arr[start] <= arr[mid]) { //left part of mid
                if(arr[start] <= target && target <= arr[mid]){
                    end = mid-1;
                }
                else
                    start = mid+1;
            }
            else {  //right part of mid
                if(arr[mid] <= target && target <= arr[end]) {
                    start = mid+1;
                }
                else
                    end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(binarySearch(arr, target));
    }
}
