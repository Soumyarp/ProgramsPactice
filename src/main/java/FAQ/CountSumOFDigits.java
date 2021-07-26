package FAQ;

public class CountSumOFDigits {
    public static void main(String[] args) {
        int num =87786;
        int sum=0;
        int rem =0;
        while(num!=0){
            /*rem =num%10;
            sum=sum+rem;*/
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println(sum);
    }
}
