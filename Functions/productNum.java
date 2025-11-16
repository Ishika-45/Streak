package Functions;

import java.util.Scanner;

public class productNum {
    public static void proNum(int a, int b){
        int pro = a * b;
        System.out.println("Product of two numbers: " + pro);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        proNum(a,b);
    }
}
