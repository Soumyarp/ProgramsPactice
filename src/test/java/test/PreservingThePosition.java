package test;

public class PreservingThePosition {

    public static void main(String[] args) {
        String str="internship at geeks for geeks";
        reverseString(str);
    }
    public static void reverseString(String str){
        char[] stringArray=str.toCharArray();
        char[] res= new char[str.length()];

        for(int i=0;i<stringArray.length;i++){
            if(stringArray[i]==' '){
                res[i]=' ';
            }
        }
        int j=res.length-1;
        for(int i=0;i<stringArray.length;i++){
            if(stringArray[i]!=' '){
                if (res[j]==' '){
                    j--;
                }
                res[j]=stringArray[i];
                j--;
            }
        }
        System.out.println(String.valueOf(res));
    }
}
