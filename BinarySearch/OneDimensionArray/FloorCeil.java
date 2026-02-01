package BinarySearch.OneDimensionArray;

public class FloorCeil {
    static int[] floorCeil(int[] a,int n, int x){
        int floor = -1;
        int ceil = -1;

        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (a[mid] == x) {
                return new int[]{x, x};
            } else if (a[mid] < x) {
                floor = a[mid];  // update floor
                start = mid + 1;
            } else {
                ceil = a[mid];    // update ceil
                end = mid - 1;
            }
        }

        return new int[]{floor, ceil};
    }
    public static void main(String[] args) {
        int[] arr = {3,4,4,7,8,10};
        int n = arr.length;
        int x = 2;
        int[] floorCeil = floorCeil(arr,n,x);
        System.out.print("The Floor and Ceil in the array: ");
        for (int i = 0; i < 2; i++) {
            System.out.print(floorCeil[i] + " ");
        }
    }
}
