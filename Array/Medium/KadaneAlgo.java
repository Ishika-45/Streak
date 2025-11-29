package Array.Medium;

public class KadaneAlgo {
    static int subarraySum(int[] arr){
        long maxSum = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum > maxSum){
                maxSum = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }

        return (int) maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,-2,7,-4};
        int maxSum = subarraySum(arr);
        System.out.println("Maximum subarray sum in an array is: " + maxSum);
    }
}
