package String;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        String str="pwwkew"; int count =0;
        Set<Character> set = new HashSet<>();
        for(int i=0;i<str.length();i++){
            Character ch =str.charAt(i);
                if(set.contains(ch)){

                }
                else {
                    count++;
                    set.add(ch);
                }
            }
        System.out.println(count);
        }
    }

