import java.util.Arrays;

public class mergeSort {
    public static void mergeSort(int[] arr,int start,int end){
        if(start >= end){
            return;
        }
        int mid = start + (end-start)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }

    public static void merge(int[] arr,int start,int mid,int end) {
        int[] temp = new int[end-start+1];
        int i = start,j = mid+1, k = 0;
        while(i <= mid && j <= end){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= end){
            temp[k++] = arr[j++];
        }
        //copy array
        for(k=0,i=start;k < temp.length;k++, i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        System.out.println("Array to be  : " + Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
