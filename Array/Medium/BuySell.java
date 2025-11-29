package Array.Medium;

public class BuySell {
    static int maxProfit(int[] arr){
        int profit = 0;
        int maxProfit = 0;
        int min = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
            profit = arr[i+1] - min;
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] stock = {7,1,5,3,6,4,8};
        int profit = maxProfit(stock);
        System.out.print("The maxprofit one can get after buying and selling the stocks are: " + profit);
    }
}
