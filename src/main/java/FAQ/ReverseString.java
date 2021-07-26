package FAQ;

public class ReverseString {
    public static void main(String[] args) {
        String str = "soumya";
        String org_string = str;
        String rev="";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            rev = Character.toString(ch);
            System.out.print(rev);
        }

    }
}
