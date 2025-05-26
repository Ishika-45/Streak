package AdvancePattern;

public class solidRhombus {
    public static void solidRhombus(int lines){
        for (int i = 1; i <= lines; i++) {
//            spaces
            for (int j = 1; j <= (lines-i); j++) {
                System.out.print(" ");
            }
//            stars - i
            for (int j = 1; j <= lines; j++) {
                System.out.print("*");
            }
//            spaces
            for (int j = 1; j <= (lines-2) ; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solidRhombus(5);
    }
}
