package basicMath;

public class Palindrome {
    public static boolean checkPalindrome(int num){
        int newNum = 0;
        int original = num;
        while(num > 0){
            newNum = newNum*10 + num%10;
            num = num/10;
        }
        if(newNum == original){
            System.out.println("Palindrome");
            return true;
        }
        System.out.println("Not Palindrome");
        return false;
    }

    public static void main(String[] args) {
        checkPalindrome(4554);
    }
}
