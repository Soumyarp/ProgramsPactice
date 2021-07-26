package String.reverse;

/*Java Program to Reverse each Words and its character of a String
* i/p java programming,  o/p -gnimmargorp avaj
* */

public class ReverseWordsandCharacter {
    public static void main(String[] args) {
        String str="java programming";
        String[] words=str.split("");
        String revStr="";
        for(int i=words.length-1;i>=0;i--){
      //      System.out.print(words[i]);
            revStr=revStr+words[i];
        }
    //    System.out.println();
        System.out.println(revStr);
    }
}
