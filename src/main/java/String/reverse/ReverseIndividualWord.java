package String.reverse;
/*
Reverse each character of the individual word but without changing the position
i/p - Java Programming , o/p avaJ gnimmargorP
 */
public class ReverseIndividualWord {
    public static void main(String[] args) {
      String str = "java programming";
      String[] words=str.split(" ");
     //   System.out.println(words.length);
      String revString="";
      for(int i=0;i<words.length;i++)
      {
          String word=words[i];
          String reveachWord="";
          for (int j=word.length()-1;j>=0;j--){
              reveachWord=reveachWord+word.charAt(j);
          }
          revString=revString+reveachWord+" ";
      }
        System.out.println(revString);

    }
}