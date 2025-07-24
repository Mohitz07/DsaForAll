package DSA_Que.HeapsAndHashing;

import java.util.PriorityQueue;

public class kthLargest {
    public static int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for(int i = k; i < arr.length; i++) {
            if(pq.peek() < arr[i]) {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int[] arr = { 10, 5, 4, 3, 48, 6, 2, 33, 53, 10 };
        int k = 4;
        System.out.println(findKthLargest(arr, 4));
    }
}
