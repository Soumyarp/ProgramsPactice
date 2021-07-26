package NaveenPrograms;

import java.util.Scanner;

public class VowelOrConsonent {

    public static void main(String[] args) {
        char ch='a';
     /* if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='o'){
          System.out.println("the given "+ch+" character is vowel");
      }
      else
          System.out.println(ch+ " : is consonent");
    }*/

     switch (ch){
         case 'a':
         case 'e':
         case 'i':
         case 'o':
         case 'u':
             System.out.println(ch+" is vowel");
             break;
         default:
             System.out.println(ch+ " is consonent");
             break;
     }
    }

}
