package String;

public class RemoveConsicutiveRepeatedCharacter {
    public static void main(String[] args) {
        String str="javvvvvvaaaaaallll";
        int i;
        for(i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                str.charAt(i+1);
            }
            else
                System.out.print(str.charAt(i));
        }
        System.out.print(str.charAt(i));
    }
}
