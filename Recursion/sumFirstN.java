package Recursion;

public class sumFirstN {
    public static long sumFirstN(long n) {
        // Write your code here.

        if(n <= 0){
            return 0;
        }

        return n + sumFirstN(n-1);

//        long res = n * (n + 1) / 2;
//        return res;
    }

    public static void main(String[] args) {
        int n = 3;
        long ans = sumFirstN(n);
        System.out.println(ans);
    }
}
