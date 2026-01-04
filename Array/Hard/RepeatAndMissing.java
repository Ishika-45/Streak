package Array.Hard;

public class RepeatAndMissing {
    static int[] repeatAndMissing(int[] arr){
         long n = arr.length;
         long sum = n * (n + 1) / 2;
         long square = (n * (n + 1) * (2 * n + 1 )) / 6;
         long s = 0 , sq = 0;
        for (int i = 0; i < n; i++) {
            s += arr[i];
            sq += (long)(arr[i] * arr[i]);
        }

        long val1 = sum - s;
        long val2 = square - sq;

        val2 = val2 / val1;

        long missing = (val1 + val2) / 2;
        long repeat = missing - val1;

        return new int[]{(int) repeat , (int) missing};
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,2};
        int[] res = repeatAndMissing(arr);
        System.out.println("Repeat and Missing number: ");
        for (int num : res){
            System.out.print(num + " ");
        }
    }
}
