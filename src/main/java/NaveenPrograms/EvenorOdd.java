package NaveenPrograms;

import java.util.Scanner;

public class EvenorOdd {

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
        System.out.println("Enter a no");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("The given no is even");
        }
        else
            System.out.println("no is odd");

    }

}
