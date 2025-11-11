package AdvancePattern;

//        *      *
//        **     *
//        * *    *
//        *  *   *
//        *   *  *
//        *    * *
//        *     **
//        *      *

public class makingN {
    public static void makingN_pattern(int lines){
        for (int rows = 1; rows <= lines; rows++) {
            for (int cols = 1; cols <= lines; cols++) {
                if(cols == 1 || cols == rows || cols == lines){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        makingN_pattern(8);
    }
}
