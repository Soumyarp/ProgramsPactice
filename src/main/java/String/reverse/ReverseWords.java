package String.reverse;

/*Reverse words in given String
* i/p= java program , o/p - program java
* */

public class ReverseWords {
    public static void main(String[] args) {
        String str="java program";
        String [] words=str.split(" ");
        String revWord="";
        for(int i=words.length-1;i>=0;i--){
            revWord   =revWord+words[i]+" ";

           // System.out.print(words[i] +" ");
        }
        System.out.println(revWord);
    }
}
