package DSA_Que.Arrays;
import java.util.*;
public class ArrayE13 {
    public static int maxProduct(int[] nums) {
            int prefix = 1;
            int suffix = 1;
            int ans = Integer.MIN_VALUE;
    
            for(int i = 0; i < nums.length; i++) {
                if(prefix == 0) 
                    prefix = 1; 
    
                if(suffix == 0) 
                    suffix = 1; 
    
                prefix *= nums[i];
                suffix *= nums[nums.length-i-1];
                ans = Math.max(ans, Math.max(prefix, suffix));
            }
            return ans;
            
            //doesnt work with 3 negative
                // int mp = nums[0]; //maximum product
                // int cp = nums[0]; //current product
    
                // for(int i=1; i<nums.length; i++) {
                //     cp = Math.max(nums[i], cp*nums[i]);
                //     mp = Math.max(cp, mp);
                // }
                // return mp;
        }
        public static void main(String[] args) {
            int[] nums = {2,3,-2,4};
            System.out.println(maxProduct(nums));
    }
}
