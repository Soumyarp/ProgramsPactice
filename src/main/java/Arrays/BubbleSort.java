package Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BubbleSort {
   /* public static void main(String[] args) {
        int arr[]={10,1,5,3,7,9,4,6};
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the values of an array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        bubbleSort(arr);
        System.out.println("After Sorting...........");
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
