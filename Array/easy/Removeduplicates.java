package Array.easy;

public class Removeduplicates {
    static int removeDuplicate(int[] nums){
//        Brute-Force
//        HashSet<Integer> unique = new HashSet<>();
//        int index = 0;
//        for(int num : nums){
//            if(!unique.contains(num)){
//                unique.add(num);
//                nums[index] = num;
//                index++;
//            }
//        }
//        return index;

        if(nums.length == 0) return 0;

        int start = 0;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[start]){
                start++;
                nums[start] = nums[i];
            }
        }
        return start + 1;
    }
    public static void main(String[] args) {
        int  arr[]= {1,1,2,2,2,3,3};

        int index = removeDuplicate(arr);
        System.out.println("Unique elements: " + index);
        System.out.print("Original array after removing duplicates: ");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}