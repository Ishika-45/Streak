package BinarySearch.OneDimensionArray;

public class RotationCount {
    static int countRotation(int[] arr){
        int s = 0;
        int e = arr.length - 1;
        while(s < e){
            int m = s + (e - s) / 2;
            if(arr[m] > arr[e]){
                s = m + 1;
            }else{
                e = m;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int count = countRotation(arr);
        System.out.print("Times the array is rotated: " + count);
    }
}
