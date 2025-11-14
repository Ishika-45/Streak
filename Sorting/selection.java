import java.util.Arrays;

public class selection {
    static void selection(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,5,7,6};
        selection(arr);
        System.out.println("Sorted array" + Arrays.toString(arr));
    }
}
