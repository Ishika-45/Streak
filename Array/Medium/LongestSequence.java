package Array.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSequence {
    static int longestConsecutiveSequence(int[] nums){
        int len = nums.length;
        if(len == 0){
            return 0;
        }

        int longest = 1;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            set.add(nums[i]);
        }
        for(int st: set){
            if(!set.contains(st - 1)){
                int cnt = 1;
                int first = st;

                while(set.contains(first + 1)){
                    first = first + 1;
                    cnt++;
                }

                longest = Math.max(longest,cnt);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.print("Original array: ");
        for(int num : nums){
            System.out.print(num + " ");
        }
        System.out.println();
        int count = longestConsecutiveSequence(nums);
        System.out.print("Longest Consecutive Sequence count is: " + count);
    }
}
