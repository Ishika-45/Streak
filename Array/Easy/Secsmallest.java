package Array.Easy;

public class Secsmallest {

    static int findSecondSmallest(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int secSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(smallest > arr[i]){
                secSmallest = smallest;
                smallest = arr[i];
            }
            if(arr[i] < secSmallest && arr[i] != smallest){
                secSmallest = arr[i];
            }
        }
        return secSmallest;
    }

    public static void main(String[] args) {
        int[] arr = {10,5,7,7,23,45};
        int secSmallest = findSecondSmallest(arr);
        System.out.println("Second Smallest: " + secSmallest);
    }
}
