package NaveenPrograms;

public class ArmstrongNo {
    public static void main(String[] args) {
        int num=153;
        int actualnum=num;
        double res=0;
        while(num!=0){
            int n =num%10;
            res=res+Math.pow(n,3);
            num = num/10;

        }
        System.out.println(res);
        if(actualnum==res){
            System.out.println("armstrong no");
        }
        else
            System.out.println("not a armstrong no");
    }
}
