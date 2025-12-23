package Array.easy;

public class Checksorted {

    static boolean isSorted(int[] arr){
        int start = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] < arr[i]){

            }
            else{
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,0,5,0,1,2};
        boolean bool = isSorted(arr);
        System.out.println("The given array is sorted or not: " + bool);
    }
}
