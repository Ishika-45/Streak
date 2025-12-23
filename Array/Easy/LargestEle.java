package Array.Easy;

public class LargestEle {
    static int LargestElement(int[] arr){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1,5,2};
        int largestEle = LargestElement(arr);
        System.out.println("The largest element is: " + largestEle);
    }
}
