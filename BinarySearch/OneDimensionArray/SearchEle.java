package BinarySearch.OneDimensionArray;

public class SearchEle {
    static int eleFound(int[] arr, int k){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == k){
                return mid;
            }
            if(arr[start] <= arr[mid]){
                if(arr[start] <= k && k < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(arr[mid] < k && k <= arr[end]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {11,13,5,8,9,10};
        int k = 5;
        int idx = eleFound(arr,k);
        System.out.print("The element " + k + " is found at index " + idx + " in rotated array");
    }
}
