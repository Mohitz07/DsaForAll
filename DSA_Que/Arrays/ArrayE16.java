package DSA_Que.Arrays;
import java.util.*;
public class ArrayE16 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        //1.Sort Array
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++) {
            if(i >= 0 && nums[i] == nums[i-1]) continue;
            
            int j = i+1, k = nums.length-1;

            while(j < k) { 
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > 0) {
                    k--;
                } else if(sum < 0) {
                    j++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++; k--;

                    while(j < k && nums[j] == nums[j-1]) j++;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
