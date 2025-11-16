package Functions;

import java.util.Scanner;

public class factorialNum {
    public static void factorialNum(int n) {
        int fact = 1;
//        for (int i = 1; i <= n; i++) {
//            fact = fact * i;
//        }
//        System.out.println("Factorial of the number:" + n + " is " + fact);
        int i = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of the number:" + n + " is " + fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of fact: ");
        int fact = sc.nextInt();
        factorialNum(fact);
    }

}
