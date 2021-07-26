package String;

public class RemoveSpacefromAString {
   /* public static void main(String[] args) {
        String str= "Java is a programming language";
       String str1= str.replace(" ","");
        System.out.println(str1);
    }*/

    public static void main(String[] args) {
        String str= "Java is a good programming language";
        char[] chars= str.toCharArray();
        String str1="";
        for(int i=0;i<chars.length;i++){
            if(chars[i]!=' '){
                str1=str1+chars[i];
            }
        }
        System.out.println(str1);
    }

}
