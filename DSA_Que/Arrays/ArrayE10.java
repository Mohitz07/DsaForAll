package DSA_Que.Arrays;
import java.util.*;

public class ArrayE10 {
                //Largest Element
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < k; i++) {
            pq.add(nums[i]);
        }
        for(int i = k; i < nums.length; i++) {
            if(pq.peek() < nums[i]) {
                pq.poll();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }
                //Smallest Element
    public static int findKthSmallest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                Collections.reverseOrder());
        for(int i = 0; i < k; i++) {
            pq.add(nums[i]);
        }
        for(int i = k; i < nums.length; i++) {
            if(pq.peek() > nums[i]) {
                pq.poll();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int nums[] = {3,2,1,5,6,4};
        int k = 2;
        //System.out.println(findKthSmallest(nums, k));
        System.out.println(findKthLargest(nums, k));
    }
}
