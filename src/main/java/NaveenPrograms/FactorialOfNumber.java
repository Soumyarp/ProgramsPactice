package NaveenPrograms;

public class FactorialOfNumber {

    public static void main(String[] args) {
       int num=5;
       getfact(num);

    }

    public static void getfact(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
