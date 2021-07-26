package String;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
       String str= sc.nextLine();
       // String str= "Hi this is soumya";
        System.out.println("removing vowels from the string :: "+str);
       String strnew= str.replaceAll("[aeiouAEIOU]","");
        System.out.println("All vowels removed successfully");
        System.out.println("After removing vowels :: "+strnew);*/
       String str1,str2="";
       int i;
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        str1=sc.nextLine();

        for (i=0;i<str1.length();i++){
            if(str1.charAt(i)=='A'||str1.charAt(i)=='E'||str1.charAt(i)=='I'
                    ||str1.charAt(i)=='O'||str1.charAt(i)=='U'||str1.charAt(i)=='a'
                    ||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u'){

            }
            else{
                str2=str2+str1.charAt(i);
            }
        }
        System.out.println(str2);
        }
    }

