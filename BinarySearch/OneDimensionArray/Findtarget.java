package BinarySearch.OneDimensionArray;

public class Findtarget {
    static int findTarget(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,6,7,9,12,16,17};
        int target = 6;
        int idx = findTarget(arr,target);
        System.out.print("The " + target + " is found at index: " + idx);
    }
}
