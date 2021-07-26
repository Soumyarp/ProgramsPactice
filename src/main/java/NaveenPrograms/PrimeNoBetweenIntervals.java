package NaveenPrograms;

public class PrimeNoBetweenIntervals {
    public static void main(String[] args) {

        int low = 1;
        int high = 50;

        while (low < high) {
            boolean flag = false;
            for(int i=2;i<=low/2;i++){
                if(low%i==0){
                    flag=true;
                    break;
                }
            }
            if(low==1){
                System.out.println("1 is not a prime no");
            }
           else if(!flag) {
                System.out.print(low + ",");
            }
            low++;

        }

    }
}