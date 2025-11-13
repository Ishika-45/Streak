package basicMath;
import java.util.*;
public class printDiv{
    public static List<Integer> printDivisors(int N) {
        // Write your code here
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                res.add(i);
                if (i != N / i) {
                    res.add(N / i);
                }
            }
        }
        // Sort the divisors
        Collections.sort(res);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        List<Integer> allDivisors = printDivisors(input);

        // Print divisors in the desired format
        for (int i = 0; i < allDivisors.size(); i++) {
            System.out.print(allDivisors.get(i));
            if (i < allDivisors.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}