package String;

import java.util.Scanner;

/**
 * Created by Soumya
 */
public class StringCount {
    public static void main (String args[]){

        Scanner in =new Scanner(System. in);

        String str=in.nextLine();

        char farr []=str.toCharArray();

        char arr[]=new char[str.length ()/2];

        int arr1[]=new int[str.length()/2];

        int count=0, count1=0;

        for(int i=0;i<str.length();i++)
        {
            if(i%2==0){

                arr[count]=farr[i];

                count++;

            }else{
                arr1[count1]=Integer.parseInt(String.valueOf(farr[i]));
                count1++;

            }

        }

        for(int j=0;j<arr.length; j++){
            for(int k=0;k<arr1[j];k++){
                System.out. println(arr[j]);
            }
        }
    }
}
