package Hashing;

public class calcFreq {
    public static int[] calcFreq(int n, int[] arr){
        int[] hash = new int[n];

        for (int i = 0; i < arr.lenth; i++) {
            if(arr[i] <= n){
                hash[arr[i] - 1]++;
            }
            if(hash[i] < hash[i+1]){
                max = hash[i+1];
            }
        }
        return hash;

    }
}
