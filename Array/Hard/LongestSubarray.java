package Array.Hard;

import java.util.*;

public class LongestSubarray {
    static int longestSubarray(int[] arr){
        Map<Integer, Integer> res = new HashMap<>();
        int sum = 0;
        int max = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];

            if(sum == 0){
                max = i + 1;
            }
            else{
                if(res.containsKey(sum)){
                    max = Math.max(max, i - res.get(sum));
                }
                else{
                    res.put(sum , i);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {9,-3,3,-1,6,-5};
        int longestSubarray = longestSubarray(arr);
        System.out.print("The longest subarray with sum zero: " + longestSubarray);
    }
}
