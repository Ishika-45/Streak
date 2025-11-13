package Recursion;

public class factNum {
    public static int factorialNum(int num){
        if(num == 0){
            return 1;
        }
        return num * factorialNum(num-1);
    }

    public static void main(String[] args) {
        int factorial = factorialNum(5);
        System.out.println(factorial);
    }
}
