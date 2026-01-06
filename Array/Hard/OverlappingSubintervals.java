package Array.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OverlappingSubintervals {
    static List<List<Integer>> overlapIntervals(int[][] intervals) {
        List<List<Integer>> intrvl = new ArrayList<>();

        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0] , b[0]));

        for(int[] interval : intervals){
            if(intrvl.isEmpty() || intrvl.get(intrvl.size() - 1).get(1) < interval[0]){
                intrvl.add(Arrays.asList(interval[0],interval[1]));
            }
            else{
                int last = intrvl.size() - 1;
                int maxEnd = Math.max(intrvl.get(last).get(1) , interval[1]);
                intrvl.get(last).set(1,maxEnd);
            }
        }

        return intrvl;
    }
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        List<List<Integer>> optimizedIntervals = overlapIntervals(intervals);
        System.out.print("Optimized Interval: ");
        for(List<Integer> interval : optimizedIntervals){
            System.out.print("[" + interval.get(0) + "," + interval.get(1) + "] ");
        }
    }
}
