package NaveenPrograms;

public class PaliondromeNo {
    public static void main(String[] args) {
        int num=121;
        int palindromeno=num;
        int rev=0;
        while(num!=0){
            int n=num%10;
            rev=rev*10+n;
            num=num/10;
        }
        System.out.println(rev);
        if (palindromeno==rev){
            System.out.println("Is paliondrome");
        }
        else
            System.out.println("Not a paliondrome no");
    }
}
