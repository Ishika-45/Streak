package BinarySearch.OneDimensionArray;

public class LastOccurence {
    static int occurence(int[] arr, int n, int k){
        int start = 0;
        int end = n;
        int res = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == k){
                res = mid;
                start = mid + 1;
            }else if(arr[mid] > k){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,13,13,13,20,40};
        int n = arr.length;
        int k = 13;
        int occurence = occurence(arr,n,k);
        System.out.print("First and Last position: " + occurence);

    }
}
