package AdvancePattern;

public class tri01 {
    public static void tri01(int lines){
        for (int row = 1; row <= lines; row++) {
            for (int col = 1; col <= row; col++) {
                if((row + col) % 2 == 0){
                    System.out.print("1");
                }
                else
                    System.out.print("0");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        tri01(5);
    }
}
