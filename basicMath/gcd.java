package basicMath;

public class gcd {
    public static int findGCD(int num1, int num2){
        int num = Math.min(num1,num2);
        int gcd = 1;
        for (int i = 1; i <= num; i++) {
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
        }
        return gcd;

//        while(a > 0 && b > 0) {
//            if(a > b) {
//                a = a % b;
//            }
//            else {
//                b = b % a;
//            }
//        }
//        if(a == 0) {
//            return b;
//        }
//        return a;
    }

    public static void main(String[] args) {
        int findGCD = findGCD(5,15);
        System.out.println(findGCD);
    }
}
