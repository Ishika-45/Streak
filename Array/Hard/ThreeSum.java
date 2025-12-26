package Array.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    static List<List<Integer>> threeSum(int[] arr){
        int len = arr.length;
        Arrays.sort(arr);

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            if(i > 0 && arr[i] == arr[i - 1]){
                continue;
            }

            int left = i + 1;
            int right = len - 1;

            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];
                if(sum == 0){
                    res.add(Arrays.asList(arr[i] , arr[left] , arr[right]));
                    left++;
                    right--;
                    while(left < right && arr[left] == arr[left - 1]){
                        left++;
                    }
                    while (left < right && arr[right] == arr[right + 1]){
                        right--;
                    }
                }
                else if(sum < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = threeSum(arr);

        for (List<Integer> triplet : res) {
            for (int num : triplet) System.out.print(num + " ");
            System.out.println();
        }
    }
}
