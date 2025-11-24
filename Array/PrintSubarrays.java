package Array;

import java.util.Arrays;

public class PrintSubarrays {
    public static void printSubarrays(int[] arr){
        int totalPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }

                System.out.println();
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println(totalPairs);
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        System.out.println("Original Array: " + Arrays.toString(arr));
        printSubarrays(arr);
        int totalPair = arr.length * (arr.length + 1) / 2;
        System.out.println("Total pairs of Subarrays formed: " + totalPair);
    }
}
