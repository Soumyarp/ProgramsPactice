package String;

public class ReverseString {
   /*private void printReverse(String str ){
       String temp="";
       for(int i= str.length()-1;i>=0;i--){
           temp=temp+str.charAt(i);
       }
       System.out.println("Reverse String is :: "+temp);
   }

    public static void main(String[] args) {
        ReverseString r = new ReverseString();
        r.printReverse("soumya");
    }*/

    public static void main(String[] args) {
        ReverseString r = new ReverseString();
        System.out.println(r.reverseString("Soumya"));
    }
    String reverseString(String str){
        if(str==null || str.length()<=1)
            return str;
      return reverseString(str.substring(1))+str.charAt(0);
    }
}
