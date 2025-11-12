package basicMath;

public class revNum {
    public static int reverseNum(int n){
        int revNum = 0;
        while(n > 0){
            revNum = revNum * 10 + n%10;
            n = n/10;
        }
        return revNum;
    }

    public static void main(String[] args) {
        int n = 9877;
        int reverseNum = reverseNum(n);
        System.out.println("The original number is: " + n);
        System.out.println("The number after reversing is: " + reverseNum);
    }
}
