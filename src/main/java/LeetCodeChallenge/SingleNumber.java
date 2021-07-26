package LeetCodeChallenge;

/*Given an array of integers, In this array every element is appers twice except for one , Find that Single one
eg :: [1,7,3,7,3]  o/p =1
Note :: the array given may or may not be sorted
Using MAP
*/

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int array[] = {1,1,2,2,3};
        int res = singleNumberUsingMap(array);
        int result = singleNumberUsingXor(array);
        System.out.println("Result using Map-->"+res);
        System.out.println("Result using XOR-->"+res);
    }

    private static int singleNumberUsingXor(int[] array) {
        int result =0;
        for(int num:array){
            result =result^num;
        }
        return result;
    }

    private static int singleNumberUsingMap(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }

        }
        return 0;
    }
}

