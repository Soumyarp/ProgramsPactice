package test;

public class PermutationOfString {
    // Java program to print all permutations of a
// given string
        public static void main(String[] args)
        {
            String str = "ABC";
            int count = str.length();
            permute(str,0,count - 1);
        }
        public static void permute(String s,int start,int end){
            if(start==end){
                System.out.println(s);
            }
            else{
                for (int i=start;i<=end;i++){
                    s=swap(s,start,i);
                    permute(s,start+1,end);
                    s=swap(s,start,i);
                }
            }
        }
        public static String swap(String a, int i,int j){
            char[] ch=a.toCharArray();
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            return String.valueOf(ch);

        }


    }


