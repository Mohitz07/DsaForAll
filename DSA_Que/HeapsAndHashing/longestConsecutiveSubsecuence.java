package DSA_Que.HeapsAndHashing;

import java.util.HashSet;

public class longestConsecutiveSubsecuence {
    public static int longestConsecutiveSubsecuenceInArray(int[] arr) {
        int longestStreak = 0;
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : arr) {
            set.add(num);
        }
        
        for(int num : arr) {
            if(!set.contains(num-1)) {
                int currNum = num;
                int count = 1;
                
                while(set.contains(currNum+1)) {
                    count++;
                    currNum++;
                }
                
                longestStreak = Math.max(longestStreak, count);
            }
        }
        return longestStreak;
    }
    public static void main(String[] args) {
        int arr[] = {2, 6, 1, 9, 4, 5, 3};
        System.out.println(longestConsecutiveSubsecuenceInArray(arr));
    }
}
