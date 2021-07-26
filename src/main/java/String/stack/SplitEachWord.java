package String.stack;

import java.util.StringTokenizer;

/**
 * Created by Soumya
 */
public class SplitEachWord {
    public static void main(String[] args) {
        String str="asd def mnp \"asde defg ghi\" xyz bba \"asdf ghk\"";
     /*   String delimeter= "\"";
     String[] strArray=str.split(delimeter,2);
        for(String s :strArray){
            System.out.println(s);

        }*/

        StringTokenizer st = new StringTokenizer(str);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }

}
