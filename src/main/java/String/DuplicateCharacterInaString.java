package String;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateCharacterInaString {

    public static void main(String[] args) {
        String str = "javaprogramming";
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            Character ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else
                map.put(ch,1);
        }
        map.forEach((k,v) ->{
            if(v>1){
                System.out.println(k);
            }
        });

    }


}
