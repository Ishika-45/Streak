package Array.Hard;

import java.util.HashMap;
import java.util.Map;

public class MaximumProSubarray {
    static int maxProSubarray(int[] arr){
        int n = arr.length;
        int pre = 1, suff = 1;

        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (pre == 0) pre = 1;

            if (suff == 0) suff = 1;

            pre *= arr[i];

            suff *= arr[n - i - 1];

            ans = Math.max(ans, Math.max(pre, suff));
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,-3,0,-4,-5};
        int maxPro = maxProSubarray(arr);
        System.out.print("Maximum Product Subarray: " + maxPro);
    }
}
