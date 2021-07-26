package String;

import java.util.*;

public class StringDecoding {
    public static void main(String[] args) {
        String str="hi this is naresh kumar";
        String Base64format=Base64.getEncoder().encodeToString(str.getBytes());
        System.out.println(Base64format);
    }
}
