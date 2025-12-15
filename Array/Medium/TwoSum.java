package Array.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
//    Brute-force approach
   /* static boolean isSumEquals(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    return true;
                }
            }

        }

        return false;*/

//    Better approach - using HashMap
    /*static String twoSumExists(int[] arr, int target){
        HashMap <Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement  = target - arr[i];
            if(map.containsKey(complement)){
                return "YES";
            }
            map.put(arr[i] , i);
        }
        return "NO";
    }*/

    static String twoSumExists(int[] arr, int target){
        Arrays.stream(arr).sorted();
        int left = 0 , right = arr.length - 1;
        while (left < right){
            if(arr[left] + arr[right] == target){
                return "YES";
            }
            else if(arr[left] + arr[right] < target){
                left++;
            }
            else{
                right--;
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;
//        boolean value = isSumEquals(arr,target);
        String isSumExists = twoSumExists(arr,target);
        System.out.println("Is the sum of two numbers equals to the target " + target + " : " + isSumExists);
    }
}
