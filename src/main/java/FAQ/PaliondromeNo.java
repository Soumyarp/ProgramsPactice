package FAQ;

public class PaliondromeNo {

    public static void main(String[] args) {
        int num = 12345;
        int rev=0;
        int org_num=num;
        while(num>0){
            rev= rev *10+num%10;
            num=num/10;
        }
        System.out.println(rev);
        if(org_num == rev)
            System.out.println("The given "+rev+" is palindrome no");
        else
            System.out.println("The given no is not a palindrome number");

    }
}
