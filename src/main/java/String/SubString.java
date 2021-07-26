package String;

/**
 * Created by Soumya
 */
public class SubString {
    public static void main(String[] args) {
        String str="abc";
        SubString s= new SubString();
        s.getString(str);
    }
    public void getString(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
