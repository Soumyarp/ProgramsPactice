package NaveenPrograms;

public class PrimeNo {
    public static void main(String[] args) {
        int num=7;
        boolean flag =false;
        for(int i=2;i<=num/2;i++){
            if(num %i==0){
                flag=true;
            }
        }
        if(num==1)
            System.out.println("It is not a prime no");
        else if(!flag){
            System.out.println(num+" is a prime no");
        }
        else
            System.out.println(num+" is not a prime no");
    }
}
