package Array.Medium;

public class RearrangeArray {
    static int[] rearrange(int[] arr){
        int len = arr.length;
        int[] res = new int[len];

        int neg = 1 , pos = 0;

        for (int i = 0; i < len; i++) {
            if(arr[i] < 0){
                res[neg] = arr[i];
                neg += 2;
            }
            if(arr[i] > 0){
                res[pos] = arr[i];
                pos += 2;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,-4,-5};
        System.out.print("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] rearrangeArray = rearrange(arr);
        System.out.print("Rearranged array: ");
        for (int i = 0; i < rearrangeArray.length; i++) {
            System.out.print(rearrangeArray[i] + " ");
        }
    }
}
