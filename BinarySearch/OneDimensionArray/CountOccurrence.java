package BinarySearch.OneDimensionArray;

public class CountOccurrence {
    static int countOccurrence(int[] arr,int x){
        int start = 0;
        int end = arr.length - 1;
        int cnt = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == x){
                cnt++;
                start++;
                end--;
            }
            else if(arr[mid] > x){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,3,3,3,3,4};
        int x = 3;
        int idx = countOccurrence(arr,x);
        System.out.print("The element " + x + " occurs " + idx + " times");
    }
}
