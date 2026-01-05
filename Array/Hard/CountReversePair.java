package Array.Hard;

import java.util.ArrayList;

public class CountReversePair {
    static int mergeSort(int[] arr, int start, int end) {
        if (start >= end) return 0;

        int mid = (start + end) / 2;
        int cnt = mergeSort(arr, start, mid);
        cnt += mergeSort(arr, mid + 1, end);
        cnt += merge(arr, start, mid, end);
        return cnt;
    }

    static int merge(int[] arr, int start, int mid, int end) {
        int cnt = 0;

        // STEP 1: Count reverse pairs
        int j = mid + 1;
        for (int i = start; i <= mid; i++) {
            while (j <= end && (long) arr[i] > 2L * arr[j]) {
                j++;
            }
            cnt += (j - (mid + 1));
        }

        // STEP 2: Normal merge
        int[] temp = new int[end - start + 1];
        int left = start, right = mid + 1, k = 0;

        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) temp[k++] = arr[left++];
            else temp[k++] = arr[right++];
        }

        while (left <= mid) temp[k++] = arr[left++];
        while (right <= end) temp[k++] = arr[right++];

        // Copy back
        System.arraycopy(temp, 0, arr, start, temp.length);

        return cnt;
    }

    public static int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,3,1};
        int N = arr.length;
        int count = reversePairs(arr);


        /*Brute - Force approach
        for (int k = 0; k < N; k++) {
            for (int l = k + 1; l <= N - 1; l++) {
                if(arr[k] > 2 * arr[l]){
                    count++;
                }
            }
        }*/

        System.out.print("Number of reverse pairs: " + count);
    }
}
