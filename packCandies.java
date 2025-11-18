import java.util.Scanner;

class packCandies {
    public static int minPackets(int n, int arr[], int reqSum) {

        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
                sum += arr[i];
                if(sum == reqSum){
                    count++;

            }

            return count;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of available packets size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Number of candies in each packet: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Total number of candies required: ");
        int reqSum = sc.nextInt();


        minPackets(n,arr,reqSum);
    }
}