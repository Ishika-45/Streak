import java.util.Arrays;

public class quickSort {
//    last element is pivot
    static int partition(int[] arr, int start, int end){
        int pivot = arr[end], idx = start-1;
        for(int j=start;j<end;j++){
//            for ascending one
            if(arr[j]<pivot){
                idx++;
                swap(arr,idx,j);
            }
        }
        swap(arr,idx+1,end);
        return idx+1;
    }

//    for descending one
//            if(arr[j]<pivot){
//        idx++;
//        swap(arr,idx,j);
//    }

    //Using median method

//    static int median(int[] arr, int start, int end){
//        int mid = start + (end-start)/2;
//        if(arr[start] > arr[mid] && arr[start] < arr[end] || arr[start] < arr[mid] && arr[start] > arr[end ]){
//            return start;
//        } else if (arr[mid] > arr[start] && arr[mid] < arr[end] || arr[mid] < arr[start] &&arr[mid] > arr[end]) {
//            return mid;
//        }else{
//            return end;
//        }
//    }
//
//    static int partition(int[] arr, int start, int end){
//        int pivot_idx = median(arr,start,end);
//        if(pivot_idx != start){
//            swap(arr,start,pivot_idx);
//        }
//        int pivot = arr[start], i = start + 1, j = end;
//        while(true){
//            while(i <= j && arr[i] < pivot){
//                i++;
//            }while(j >= i && arr[j] > pivot){
//                j--;
//            }
//            if(i <= j){
//                swap(arr,i,j);
//            }else{
//                break;
//            }
//        }
//        swap(arr,start,j);
//        return j;
//    }

    static void swap(int[] arr,int ele1, int ele2){
        int temp = arr[ele1];
        arr[ele1] = arr[ele2];
        arr[ele2] = temp;
    }
    static void quickSort(int[] arr, int start,int end){
        if (start<end){
            int key = partition(arr,end,start);
            quickSort(arr,start,key-1);
            quickSort(arr,key+1,end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        quickSort(arr,0,arr.length-1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}




