package NaveenPrograms;

public class SumOFNaturalNo {

    public static void main(String[] args) {
       int num=100;
       int sum=0;
       int sum1=0;
       for (int i=1;i<=num;i++){
           sum=sum+i;
       }
        System.out.println(sum);
        System.out.println("--------------------------------");
        int k=1;
        while(num>=k){
            sum1=sum1+k;
            k++;
        }
        System.out.println(sum1);
    }
}
