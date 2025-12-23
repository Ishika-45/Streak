package Array.Easy;

public class Smallest {

    static int findSmallest(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {10,34,56,75,2};
        int smallest = findSmallest(arr);
        System.out.println("The smallest element in an array: " + smallest);
    }
}
