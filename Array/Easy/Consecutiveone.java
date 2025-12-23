package Array.Easy;

public class Consecutiveone {
    static int countOnes(int[] arr){
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == 1 && arr[i + 1] == 1){
                count++;
                maxCount = Math.max(count,maxCount);
            }
            else{
                count = 0;
            }
        }
        return maxCount + 1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        int numOnes = countOnes(arr);
        System.out.println("The number of consecutive ones are: " + numOnes);
    }
}
