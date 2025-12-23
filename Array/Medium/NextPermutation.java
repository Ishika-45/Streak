package Array.Medium;

public class NextPermutation {
    static void nextPermutation(int[] nums){
        int idx = -1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] < nums[i + 1]){
                idx = i;
                break;
            }
        }

        if(idx == -1){
            rev(nums , 0 , nums.length - 1);
            return;
        }

        for (int i = nums.length - 1; i > idx; i--) {
            if(nums[i] > nums[idx]){
                swap(nums, i , idx);
                break;
            }
        }

        rev(nums, idx + 1, nums.length - 1);
    }

    static void rev(int[] nums , int strt, int end){
        while(strt < end){
            swap(nums, strt, end);
            strt++;
            end--;
        }
    }

    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1};
        System.out.print("Original array: ");
        for(int num : nums){
            System.out.print(num + " ");
        }
        System.out.println();
        nextPermutation(nums);
        System.out.print("Next Permutation: ");
        for (int num : nums){
            System.out.print(num + " ");
        }
    }
}
