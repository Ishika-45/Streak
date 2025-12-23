package Array.Easy;

public class Secondlargest {

    static int secondLargestEle(int[] arr){
        int largest = arr[0];
        int secLargest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secLargest && arr[i] != largest) {
                secLargest = arr[i];

            }
        }
        return secLargest;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,7,7,5};
        int secLargest = secondLargestEle(arr);
        System.out.println(secLargest);
    }
}
