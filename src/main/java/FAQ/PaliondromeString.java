package FAQ;

import java.util.Scanner;

public class PaliondromeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a paliondrome String");
        String str= sc.next();
        String org_string =str;
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(org_string.equals(rev))
            System.out.println("The given string is paliondrome");
        else
            System.out.println("the given string is not a paliondrome");
    }
}
