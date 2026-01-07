package Array.Hard;
import java.util.HashMap;

public class MajorityEle {
    static int majorityEle(int[] nums){
        int len = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
           int curr = nums[i];

           if(map.containsKey(curr)){
               map.put(curr, map.get(curr) + 1);
           }else{
               map.put(curr,1);
           }

           if(map.get(curr) > len / 3){
               return curr;
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,3,2};
        int majorityEle = majorityEle(arr);
        System.out.print("The majority element in the array is: " + majorityEle);

    }
}
