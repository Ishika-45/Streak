package Functions;

import java.util.Scanner;

public class sumNum {
    public static void sumNum(int a , int b){
        int sum = a + b;
        System.out.println("Sum of two numbers: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNum = sc.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = sc.nextInt();
        sumNum(firstNum,secondNum);
    }
}
