package BinarySearch.OneDimensionArray;

public class UpperBound {
    static int upperBound(int[] arr, int x, int n){
        int start = 0;
        int end = n;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > x){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,8,9,15,19};
        int n = arr.length;
        int x = 9;
        int upperBound = upperBound(arr,x,n);
        System.out.print("Upper Bound: " + upperBound);
    }
}
