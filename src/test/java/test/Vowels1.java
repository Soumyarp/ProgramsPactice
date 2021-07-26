package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Soumya on Aug,2020
 */
public class Vowels1 {
    public static void main(String[] args) {
        String str = "geeks for geeks";
        int count=0;
     //   for (int i = 0; i < str.length(); i++) {
        for(Character cha:str.toCharArray()){
            if(cha=='a'||cha=='e'||cha=='i'||cha=='o'||cha=='u'){
                count++;
               System.out.print(cha+" ");
                //   System.out.print(str.charAt(i) +" ");
            }

    }
        System.out.println("");
        System.out.println(count);
}
}
