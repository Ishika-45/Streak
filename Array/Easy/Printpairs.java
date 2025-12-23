package Array.easy;

import java.util.Arrays;

public class Printpairs {
    public static void printPairs(int[] arr){
        int totalPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("Pairs in array: (" + arr[i] + " , " + arr[j] + ")");
                totalPairs++;
            }
        }
        System.out.println(totalPairs);
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        System.out.println("Original Array: " + Arrays.toString(arr));
        printPairs(arr);
//        Another way to print totalPairs
        int totalPairs = arr.length * (arr.length - 1) / 2;
        System.out.println("Total pairs: " + totalPairs);
    }
}
