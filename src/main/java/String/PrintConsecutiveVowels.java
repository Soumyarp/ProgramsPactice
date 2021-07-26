package String;

public class PrintConsecutiveVowels {

    boolean is_vow(char c){
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
    }
    void printVowels(String str){
        int c=0;
        for (int i=1;i<str.length();i++){
            if(is_vow(str.charAt(i-1))&&is_vow(str.charAt(i))){
                System.out.println(""+str.charAt(i-1)+str.charAt(i));
                c++;
            }
        }
        System.out.println("no of such pairs "+c);
    }

    public static void main(String[] args) {
        String str="BEAUTIFUL GOOGLE";
        PrintConsecutiveVowels p= new PrintConsecutiveVowels();
        p.printVowels(str);
    }
}
