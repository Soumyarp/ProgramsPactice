package ProgrammingTutorials.GeneralPrograms;

import java.util.Scanner;

public class PrimeNo {
    public static boolean checkPrime(int num){
    //    for(int i=2;i<num;i++){
   //     for (int i=2;i<=num/2;i++){
            for (int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
      //  int n =11;
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=2 && checkPrime(n)){
            System.out.println("It is a prime no");
        }
        else
            System.out.println("not a prime no");
    }
}
