package BinarySearch.OneDimensionArray;

public class RotatedArray {
    static boolean eleFound(int[] arr, int k){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == k){
                return true;
            }
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                start++;
                end--;
                continue;
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
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {7,8,1,2,3,3,3,4,5,6};
        int k = 10;
        boolean isFound = eleFound(arr,k);
        System.out.print(isFound);
    }
}
