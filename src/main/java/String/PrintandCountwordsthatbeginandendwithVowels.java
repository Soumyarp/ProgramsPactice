package String;

public class PrintandCountwordsthatbeginandendwithVowels {
        void printandCountWords(String str){
            int count=0; String w="";

            for(int i=0;i<=str.length();i++){
                char c= str.charAt(i);
                if (c !=' '){
                    w=w+c;
                }
                else{
                    char c1= w.charAt(0);
                    char c2=w.charAt(i-1);
                    if(is_Vowels(c1)&&is_Vowels(c2)){
                        System.out.println(w);
                        count++;
                    }
                    w=" ";
                }
            }
            System.out.println("Toal no of words"+count);
        }

        boolean is_Vowels(char ch){
            return(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');
        }

    public static void main(String[] args) {
        String str="one day we are going to acheive";
        PrintandCountwordsthatbeginandendwithVowels ps= new PrintandCountwordsthatbeginandendwithVowels();
        ps.printandCountWords(str);
    }
}

