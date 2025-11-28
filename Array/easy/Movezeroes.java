package Array.easy;

public class Movezeroes {
    static void zeroesToEnd(int[] arr){
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        if(j == -1) return;
        for (int i = j + 1; i < arr.length; i++) {
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        /*If input is ArrayList
        int j = -1;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == 0){
                j = i;
                break;
            }
        }
        if(j == -1) return;
        for (int i = j + 1; i < arr.size(); i++) {
            if(arr.get(i) != 0){
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
                j++;
            }
        }*/
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,0,1};
        int len = arr.length;
        System.out.print("Print original array: ");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        zeroesToEnd(arr);
        System.out.print("Move zeroes to end: ");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
