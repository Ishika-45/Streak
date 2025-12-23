package Array;

public class Binarysearch {
    static int linearSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else return mid;
            start++;
            end--;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 3;
        int index = linearSearch(arr, target);
        System.out.print("The target element " + target + " is found at index: " + index);
    }
}
