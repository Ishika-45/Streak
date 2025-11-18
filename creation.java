import java.util.Scanner;
public class creation {
    public static boolean searchKey(int[][] matrix,int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key){
                    System.out.print("Key is found at index: (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of cols: ");
        int col = sc.nextInt();

        int matrix[][] = new int[rows][col];
//        int rows = matrix.length;
//        int col = matrix[0].length;

        System.out.print("Enter the values of matrix :");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        System.out.println("Final Matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter the value of key to be found: ");
        int key = sc.nextInt();
        searchKey(matrix,key);
    }
}
