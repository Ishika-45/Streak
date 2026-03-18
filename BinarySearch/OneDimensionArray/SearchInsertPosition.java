package BinarySearch.OneDimensionArray;

public class SearchInsertPosition {
    static int insertPos(int[] arr,int x){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == x){
                return mid;
            } else if (arr[mid] < x) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,9,21,35};
        int x = 8;
        int insertPos = insertPos(arr,x);
        System.out.print("The target value " + x + " can be inserted at index: " + insertPos);
    }
}

