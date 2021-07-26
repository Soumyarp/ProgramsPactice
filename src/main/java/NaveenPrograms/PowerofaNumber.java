package NaveenPrograms;

public class PowerofaNumber {

    public static void main(String[] args) {
        int base=3;
        int exponent=4;
        long res=1;
        while(exponent!=0){
            res=res*base;//res*=base;
            exponent--;
        }
        System.out.println(res);

     //   System.out.println(Math.pow(2,4));

    }
}
