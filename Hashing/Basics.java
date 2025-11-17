package Hashing;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        //precompute:
        int[] hash = new int[13];
        for (int i = 0; i < len; i++) {
            hash[arr[i]] += 1;
        }

        int query = sc.nextInt();
        while(query-- != 0){
            int num = sc.nextInt();
            //fetching
            System.out.println(hash[num]);
        }
    }
}
