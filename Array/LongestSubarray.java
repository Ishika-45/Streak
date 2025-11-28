package Array;

public class LongestSubarray {
    static int longestSubarr(int[] arr, int k){
        int n = arr.length;
        int maxLen = 0;
        int sum = arr[0];
        int left = 0 , right = 0;

        while (right < n){
            while (left <= right && sum > k){
                sum -= arr[left];
                left++;
            }
            if(sum == k){
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if(right < n){
                sum += arr[right];
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {-1, 1, 1};
        int k = 1;
        int maxLen = longestSubarr(arr,k);
        System.out.println("The longest subarray that sums to " + k + " is: " + maxLen);
    }
}
