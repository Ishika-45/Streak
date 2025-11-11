package Pattern;

public class Basic {
    public static void main(String[] args) {
        int row = 2;
        int col = 3;
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
