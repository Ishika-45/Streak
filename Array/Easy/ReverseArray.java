package Array;

import java.util.Arrays;

public class ReverseArray {
    public static void reverseArray(int[] arr){
        int first = 0;
        int last = arr.length - 1;
        while(first < last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }

    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            res[i] = nums[n-i-1];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        System.out.println("Original array: " + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Reverse of an array: " + Arrays.toString(arr));
        int[] num = {1,2,3,4};
        System.out.println("Original array: " + Arrays.toString(num));
        reverseArray(num);
        System.out.println("Reverse of an array: " + Arrays.toString(num));

    }
}
