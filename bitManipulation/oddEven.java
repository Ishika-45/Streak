package bitManipulation;

public class oddEven {
    public static void oddOrEven(int num){
        int bitMask = 1;
        if((num & bitMask) == 0){
            //even number if LSB = 0
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        oddOrEven(5);
        oddOrEven(8);
    }
}
