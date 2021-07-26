package ProgrammingTutorials.GeneralPrograms;

import java.util.Scanner;

public class PrimeNobetweenTwoIntervals {
    public static void checkPrime(int start, int end){
    //    for(int i=2;i<num;i++){
   //     for (int i=2;i<=num/2;i++){
        while (start<end) {
            boolean flag= false;
            for (int i = 2; i <= Math.sqrt(start); i++) {
                if (start % i == 0) {
                    flag= true;
               //     break;

                }
            }
            if(start==1){
                System.out.println("1 is not a prime no");
            }
            else if(!flag) {
                System.out.print(start + ",");
            }
            start++;
        }

    }
    public static void main(String[] args) {
        int start=1;
        int end =50;
        checkPrime(start,end);


    }
}
