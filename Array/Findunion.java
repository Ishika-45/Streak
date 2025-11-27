package Array;

import java.util.ArrayList;
import java.util.List;

public class Findunion {
    static List<Integer> Union(int[] arr1, int[] arr2, int m, int n){

        List<Integer> union= new ArrayList<>();

        int i = 0, j = 0;
        while(i < m && j < n){
            if(arr1[i] < arr2[j]){
                if(union.isEmpty() || union.get(union.size() - 1) != arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }
            else if(arr2[j] < arr1[i]){
                if(union.isEmpty() || union.get(union.size() - 1) != arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
            else{
                if(union.isEmpty() || union.get(union.size() - 1) != arr1[i]){
                    union.add(arr1[i]);
                }
                i++; j++;
            }
        }
        while(i < m){
            if(union.isEmpty() || union.get(union.size() - 1) != arr1[i]){
                union.add(arr1[i]);
            }
            i++;
        }

        while(j < n){
            if(union.isEmpty() || union.get(union.size() - 1) != arr2[j]){
                union.add(arr2[j]);
            }
            j++;
        }
        return union;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5};
        int m = 5;
        int n = 5;
        List<Integer> Union = Union(arr1,arr2,m,n);
        System.out.println("Union of two sorted arrays: " + Union);
    }
}
