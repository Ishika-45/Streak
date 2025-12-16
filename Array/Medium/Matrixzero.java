package Array.Medium;

public class Matrixzero {
    static void setZeroes(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean firstRow = false;
        boolean firstCol = false;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(matrix[i][j] == 0){
                    if(i == 0){
                        firstRow = true;
                    }
                    if(j == 0){
                        firstCol = true;
                    }
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if(firstRow){
            for (int i = 0; i < cols; i++) {
                matrix[0][i] = 0;
            }
        }

        if(firstCol){
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int rows = matrix.length;
        int cols = matrix[0].length;
        System.out.println("Print original matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        setZeroes(matrix);
        System.out.println("Matrix set zeroes:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
