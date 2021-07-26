package String;

public class CountWordsInString {

  /*  public static void main(String[] args) {
        String str = "Java Programming language";
        //Approach 1
        System.out.println(str.split("\\s+").length);
        //Approach 2
        System.out.println( countWord(str));

    }

    private static int countWord(String str) {
        int wordCount =1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) ==' ' && i<str.length()-1 &&str.charAt(i+1) !=' ' ){
                wordCount++;

            }
        }
        return wordCount;
    }*/

    public static void main(String[] args) {
        String str = "Java Programming language";
        System.out.println(str.length());
        int wordCount =1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==' '&&str.charAt(i+1)!=' '){
                wordCount++;

            }
        }
        System.out.println(wordCount);
    }
}
