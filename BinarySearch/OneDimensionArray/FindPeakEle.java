package BinarySearch.OneDimensionArray;

public class FindPeakEle {
    static int findPeak(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid+1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,5,1};
        int peakEle = findPeak(arr);
        System.out.print("Peak element in the array is at index: " + peakEle);
    }
}
