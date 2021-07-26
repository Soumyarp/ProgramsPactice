package String;

import java.util.Arrays;

public class SortBasedOnAscii {
    private void StringtoAscii(String str){
       try {
           byte[] bytes= str.getBytes("US-ASCII");
           System.out.println(Arrays.toString(bytes));
       }
       catch (java.io.UnsupportedEncodingException e){
           e.printStackTrace();
       }
    }

    public static void main(String[] args) {
        SortBasedOnAscii s = new SortBasedOnAscii();
        s.StringtoAscii("soumya");
    }
}
