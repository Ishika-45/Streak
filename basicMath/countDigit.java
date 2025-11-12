package basicMath;

public class countDigit {
    public static int countDigits(int num){
        int count = 0;
        while(num > 0){
            num = num / 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 143;
        int numDigit = countDigits(n);
        System.out.println("The number of digits in " + n + " is: " + numDigit);

    }
}
