package AdvancePattern;

//*****
//*   *
//*   *
//*****

public class hollowRectangle {
    public static void hollow_rect(int rows, int cols){
//        outer loop -> number of rows
        for (int i = 1; i <= rows; i++) {
//            inner loop -> number of cols
            for (int j = 1; j <= cols; j++) {
//                cell - (i,j)
                if(i == 1 || i == rows || j == 1 || j == cols){
//                    boundary cells
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_rect(4,5);
    }
}
