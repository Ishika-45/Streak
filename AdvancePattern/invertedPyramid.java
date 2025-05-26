package AdvancePattern;

//Inverted and Rotated half-pyramid pattern
public class invertedPyramid {
    public static void rotated_halfpyramid(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(j == n || j > n-i){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rotated_halfpyramid(4);
    }
}
