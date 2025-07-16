package DSA_Que.HeapsAndHashing;
import java.util.*;
public class kthsmallest {
    public static int findKthSmall(List<Integer> arr, int k) {
        HashSet<Integer> removed = new HashSet<>(arr);
        // for(int nums : arr) {
        //     removed.add(nums);
        // }
        int count = 0; int num = 1;
        while(count < k) {
            if(!removed.contains(num)) 
                count++;
            num++;
        }
        return num-1;
    }
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 3);
        System.out.println(findKthSmall(arr, 4));
    }
}
