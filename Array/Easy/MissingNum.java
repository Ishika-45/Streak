package Array.Easy;

public class MissingNum {
    static int missNum(int[] arr, int n){
        int sum = n * (n + 1) / 2;
        for (int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 3;
        int[] arr = {1,3};
        int missingNumber = missNum(arr,n);
        System.out.println("The missing number in the array is: " + missingNumber);
    }
}
