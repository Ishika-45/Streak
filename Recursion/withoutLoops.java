package Recursion;

public class withoutLoops {


        private static void fillArray(int i, int n, int[] arr) {
            arr[i - 1] = i;
            if (i == n)
                return;
            fillArray(i + 1, n, arr);
        }

        public static int[] printNos(int x) {
            int[] arr = new int[x];
            fillArray(1, x, arr);
            return arr;
        }


}
