package test;

import java.util.*;

/**
 * Created by Soumya on Sep,2020
 */
public class DupliacteElements {

    public static void main(String[] args) {
        int array[]= {25,25,25,45,45,55,75,65};
        Map<Integer,Integer> hmap = new LinkedHashMap<>();
        for(int i=0;i<array.length;i++){
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    hmap.put(i, array[i]);
                }
            }
        }
        System.out.println(hmap);


    }
}
