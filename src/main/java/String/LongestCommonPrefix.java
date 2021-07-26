package String;

public class LongestCommonPrefix {
    public static void main(String[] args) {
     String str[]={"cat","cable","camera"};
    //    String str[]=null;
      //  String str[]={"rat","cab","cam"};
        String value =commonprefix(str);
        System.out.println(value);
    }

    private static String commonprefix(String[] str) {
        if(str ==null || str.length==0){
            return "Null String Provided";
        }
        String lcp=str[0];
        for(int i=1;i<str.length;i++){
            String currentWord =str[i];
            int j=0;
            while(j<currentWord.length() && j<lcp.length() &&
            currentWord.charAt(j)==lcp.charAt(j)){
                j++;
            }
            if(j==0)
                return "No common Prefix between the string";
            lcp=currentWord.substring(0,j);
        }
        return lcp;
    }
}
