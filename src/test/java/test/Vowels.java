package test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Soumya on Aug,2020
 */
public class Vowels {
    public static void main(String[] args) {
        String str = "soumya";
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 0);
        map.put('e', 0);
        map.put('i', 0);
        map.put('o', 0);
        map.put('u', 0);
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (map.containsKey(ch)) {
                int count = map.get(ch);
                map.put(ch, ++count);
            }
        }
        System.out.println(map);
    }
}