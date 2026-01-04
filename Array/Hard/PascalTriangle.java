package Array.Hard;

import java.util.*;


public class PascalTriangle {
//    static void pascalTriangle(int n){
//        int i = 0;
//        while(i < n){
//            int num = (int)Math.pow(11,i);
//            System.out.print(num);
//            System.out.println();
//            i++;
//        }
//
//    }
public static List<Integer> generateRow(int row){

    List<Integer> ansRow = new ArrayList<>();
    ansRow.add(1);
    int ans = 1;
    for(int i=1; i<row; i++){
        ans = ans*(row-i);
        ans= ans/i;
        ansRow.add(ans);
    }
    return ansRow;
}
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=numRows; i++){
            ans.add(generateRow(i));
        }

        return ans;
    }
    public static void main(String[] args) {
        int numRows = 6;
        System.out.println("Pascal Triangle: ");
//        pascalTriangle(numRows);
        List<List<Integer>> pascal = generate(numRows);
        System.out.print(pascal);
    }
}


/*LeetCode solution:-
class Solution {

    public List<Integer> generateRow(int row){
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        int ans = 1;
        for(int i=1; i<row; i++){
            ans = ans*(row-i);
            ans= ans/i;
            ansRow.add(ans);
        }
        return ansRow;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=numRows; i++){
            ans.add(generateRow(i));
        }

        return ans;
    }
}*/