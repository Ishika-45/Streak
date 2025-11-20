package Hashing;

import java.util.*;

public class Countchar {

    public static void main(String args[]) {

        char arr[] = {'a' , 'a', 'b', 'c', 'b', 'a'};
        countChar(arr);
    }

    static void countChar(char[] arr){
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) +  1);
            }else{
                map.put(arr[i] , 1);
            }
        }
        int maxFreq = 0, minFreq = arr.length;
        char maxChar = ' ', minChar = ' ';

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            int count = entry.getValue();
            char character = entry.getKey();

            if (count > maxFreq) {
                maxChar = character;
                maxFreq = count;
            }
            if (count < minFreq) {
                minChar = character;
                minFreq = count;
            }
        }

        System.out.println(maxChar);
        System.out.println(minChar);





    }

}
