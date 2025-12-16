package Array.Medium;

import java.util.HashMap;

public class MajorityEle {

    static int majorityElement(int[] arr){
//        Brute-Force Approach
        /*int len = arr.length;
        for (int i = 0; i < len; i++) {
            int cnt = 0;
            for (int j = 0; j < len; j++) {
                if(arr[i] == arr[j]){
                    cnt++;
                }
            }
            if(cnt > len / 2){
                return arr[i];
            }
        }
        return -1;*/

//        Using HashMap
        int len = arr.length;
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int current = arr[i];

            if (map.containsKey(current)) {
                map.put(current, map.get(current) + 1);
            } else {
                map.put(current, 1);
            }

            if (map.get(current) > len / 2) {
                return current;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,1,2};
        int majorityEle = majorityElement(arr);
        System.out.print("The majority element in the array is: " + majorityEle);
    }
}
