package Array.Medium;

public class Spiralmatrix {
    static void matrixSpiral(int[][] matrix,int rows, int cols){
        int startRow = 0 , endRow = rows;
        int startCol = 0 , endCol = cols;
        System.out.println("Spiral matrix: ");
        while(startRow <= endRow && startCol <= endCol){
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");

            }
            for (int i = endCol - 1; i >= startCol; i--) {
                if(startRow == endRow){
                    return;
                }
                System.out.print(matrix[endRow][i] + " ");

            }
            for (int i = endRow - 1; i > startRow; i--) {
                if(startCol == endCol){
                    return;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int rows = matrix.length - 1;
        int cols = matrix[0].length - 1;
        System.out.println("Print original matrix: ");
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        matrixSpiral(matrix,rows,cols);

    }

}
