package Array.Medium;

import java.util.ArrayList;
import java.util.Collections;

public class Leaderarray {
    public static ArrayList<Integer> findLeaders(ArrayList<Integer> elements, int n) {
        // Write your code here.

        ArrayList res = new ArrayList();
        if(n == 0){
            return res;
        }
        int leader = elements.get(n - 1);
        res.add(leader);

        for (int i = n - 2; i >= 0; i--) {
            if(elements.get(i) > leader){
                leader = elements.get(i);
                res.add(leader);
            }
        }

        Collections.reverse(res);
        return res;
    }
    public static void main(String[] args) {
        ArrayList ele = new ArrayList();
        ele.add(10);
        ele.add(22);
        ele.add(12);
        ele.add(3);
        ele.add(0);
        ele.add(6);

        int len = ele.size();

        ArrayList<Integer> leaders = findLeaders(ele , len);

        System.out.println("Leaders: ");
        for(int leader : leaders){
            System.out.print(leader + " ");
        }

    }
}
