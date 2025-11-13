package basicMath;

public class armStrong {
    public static boolean checkArmstrong(int num){
        int original = num;
        int sum = 0;
        int length = String.valueOf(num).length();

        while(num > 0){
            int calc = num%10;
            sum = sum + (calc ^length);
//            sum += Math.pow(calc, length);
            num = num/10;
        }
        return sum == original ? true : false;
    }

    public static void main(String[] args) {
int num = 1;
        if (checkArmstrong(num)) {
            System.out.println(" is an Armstrong number.");
        } else {
            System.out.println(" is not an Armstrong number.");
        }
    }
}
