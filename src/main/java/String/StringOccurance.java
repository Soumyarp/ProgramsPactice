package String;

import java.util.HashMap;
import java.util.Map;

public class StringOccurance {
    public static void main(String[] args) {
       String str= "programming";
       Map<Character,Integer> hmap= new HashMap<Character, Integer>();
       for(Character c:str.toCharArray()){
           if(hmap.containsKey(c)){
               hmap.put(c,hmap.get(c)+1);
           }
           else
               hmap.put(c,1);
       }
        System.out.println(hmap);

    }
}
