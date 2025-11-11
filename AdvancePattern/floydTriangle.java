package AdvancePattern;

//        1
//        23
//        456
//        78910
//        1112131415

public class floydTriangle {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
