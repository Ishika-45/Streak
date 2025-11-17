package Array;

public class maxSubarraySum {
    public static void maxSum(int[] arr){
        int currSum = 0 , maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    currSum += arr[k];
                }
                System.out.println();
                System.out.println("Sum of subarray: " + currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        maxSum(arr);
    }
}
