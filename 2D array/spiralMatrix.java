import java.util.Scanner;

public class spiralMatrix {
    public static void spiralMatrix(int[][] matrix){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol){

            //top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            //right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            //bottom
            for (int j = endCol - 1; j >= startCol ; j--) {
                if(startRow == endRow){
                    return;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            //left
            for (int i = endRow - 1; i > startRow ; i--) {
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


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[4][4];
        int rows = matrix.length;
        int col = matrix[0].length;

        System.out.print("Enter the values of Matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Final Matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        spiralMatrix(matrix);
    }
}
