package AdvancePattern;

public class butterFly {
    public static void butterflyPattern(int lines){
//        for (int rows = 1; rows <= lines; rows++) {
//            for (int cols = 1; cols <= lines; cols++) {
//                if(cols == 1 || cols == rows || cols == lines){
//                    System.out.print("*");
//                }
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }

//        1st Half
        for (int i = 1; i <= lines; i++) {
//            stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
//            spaces - 2*(n-i)
            for (int j = 1; j <= 2*(lines-i); j++) {
                System.out.print(" ");
            }
//            stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        2nd half
        for (int i = lines; i >= 1; i--) {
//            stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
//            spaces - 2*(n-i)
            for (int j = 1; j <= 2*(lines-i); j++) {
                System.out.print(" ");
            }
//            stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        butterflyPattern(5);
    }
}
