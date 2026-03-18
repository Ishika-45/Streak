package BinarySearch.OneDimensionArray;

public class SingleEle {
    static int occurOnce(int[] arr){
        int n = arr.length;
        if(n == 1){
            return arr[0];
        }
        if(arr[0] != arr[1]){
            return arr[0];
        }
        if(arr[n - 1] != arr[n - 2]){
            return arr[n - 1];
        }
        int start = 1;
        int e = arr.length - 2;
        while(start <= e){
            int mid = start + (e - start) / 2;
                if(arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
                    return arr[mid];
                }
                if((mid % 2 == 1 && arr[mid] == arr[mid - 1]) ||
                        (mid % 2 == 0 && arr[mid] == arr[mid + 1])){
                    start = mid + 1;
                }
                else{
                    e = mid - 1;
                }
        }
        return -1;
    }
    public static void main(String[] args) {
//        int[] arr = {1,1,2,2,3,3,4,5,5,6,6};
        int[] arr = {2 ,4 ,4 ,11 ,11 ,26 ,26 ,29 ,29 ,30 ,30 ,41 ,41 ,46 ,46};
        int ele = occurOnce(arr);

        System.out.print("The element which occurs only once is " + ele);
    }
}
