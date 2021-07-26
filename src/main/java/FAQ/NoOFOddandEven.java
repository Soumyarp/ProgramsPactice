package FAQ;

public class NoOFOddandEven {
    public static void main(String[] args) {
        int num =576738923;
        int evencount=0;
        int oddcount=0;
        int rem=0;
        while(num!=0){

            rem=num%10;
            if(rem%2==0)
                evencount++;
            else
                oddcount++;
            num =num/10;

        }
        System.out.println("even no "+evencount+"odd num"+oddcount);
    }
}
