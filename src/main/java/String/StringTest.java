package String;

/**
 * Created by Soumya
 */
public class StringTest {

    //ip =abcD  Op: A-Bb-Ccc-dDDD

    public static void main(String[] args) {
        System.out.println(repeatCh("abcD"));
    }

    public static String repeatCh(String str) {
        String c = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    c= c+ (Character.isUpperCase(str.charAt(i)) ?
                            Character.toLowerCase(str.charAt(i)) :
                            Character.toUpperCase(str.charAt(i)));

                } else
                    c = c + str.charAt(i);
            }
  if(i!=str.length()-1) c=c+"-";
        }
        return c;
    }
}