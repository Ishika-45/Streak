package Recursion;
import java.util.Scanner;

public class fibonacci {
    public static int fibo(int n){
        if(n == 1){
            return 1;
        }
        else if(n == 2){
            return 1;
        }
        else return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nthNum = fibo(n);
        System.out.println(nthNum);

//        if (n <= 0) {
//            System.out.print(0);
//            return;
//        }
//
//        int prev = 0, curr = 1;
//        for(int i = 1; i < n; i++){
//            int next = prev + curr;
//            prev = curr;
//            curr = next;
//        }
//
//        System.out.print(curr);
    }
}