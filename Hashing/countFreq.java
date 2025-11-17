package Hashing;

public class countFreq {
        public static int[] countFrequency(int n, int x, int[] nums) {
            int[] frequency = new int[n];

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= n) {
                    frequency[nums[i] - 1]++;
                }
            }

            return frequency;
        }

}
