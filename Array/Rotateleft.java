package Array;

public class Rotateleft {
    static void rotate(int[] arr){
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = first;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotate(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
