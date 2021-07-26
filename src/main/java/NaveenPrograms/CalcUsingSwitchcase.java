package NaveenPrograms;

import java.util.Scanner;

public class CalcUsingSwitchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        System.out.println("Enter the operator :(+,-,/,*)");
        char operator=sc.next().charAt(0);
        double result =0;
        switch (operator){
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '/':
                result=num1/num2;
                break;
            case '*':
                result=num1*num2;
                break;
             default:
                 System.out.println("Please pass the correct operator");
                break;

        }
        System.out.println(result);

    }
}
