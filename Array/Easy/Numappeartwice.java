package Array.Easy;

public class Numappeartwice {
    static int appearsOnce(int[] arr){
        int count = 1;
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[i] == arr[j]){
                count++;
            }
            if(count == 1){
                return arr[i];
            }
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        int countOne = appearsOnce(arr);
        System.out.println("The number which appears once in the array is: " + countOne);
    }
}
