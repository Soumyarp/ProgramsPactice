package String;
/*input =webrewrite
* output =b
* */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NoneRepeatingCharinaString {

    //Using HashMap

    public static void usingHashmap(String str) {
        Character ch;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
             ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else
                map.put(ch,1);
        }
        for (int j=0;j<str.length();j++){
            ch =str.charAt(j);
            if(map.get(ch)==1){
                System.out.println(ch);
                break;

            }
        }
    }

   //Using Linked HashMap------------------------------------------------

    public static void usingLinkedHashMap(String str) {
        Map<Character,Integer> map= new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            Character ch= str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else
                map.put(ch,1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        String str= "webrewrite";
        usingHashmap(str);
        usingLinkedHashMap(str);

    }
}