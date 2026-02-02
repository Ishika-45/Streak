package BinarySearch.OneDimensionArray;

public class LowerBound {
    static int lowerBound(int[] arr, int lb){
        int start = 0;
        int end = arr.length;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] >= lb){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        int x = 2;
        int lowerBound = lowerBound(arr, x);
        System.out.print("Lower Bound: " + lowerBound);
    }
}
