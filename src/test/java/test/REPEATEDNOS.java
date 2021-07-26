package test;

import java.util.Arrays;

public class REPEATEDNOS {
   /* public static void findDuplcate(int[] arr, int size) {
        int i;
        System.out.println("The repeating elements are : ");

        for (i = 0; i < size; i++)
        {
            if (arr[ Math.abs(arr[i])] >= 0)
                arr[ Math.abs(arr[i])] = -arr[ Math.abs(arr[i])];
            else
                System.out.print(Math.abs(arr[i]) + " ");
        }

    }*/

    public static void main(String[] args) {
       /* int arr[] = {-1,2,5,6,4,3,2,2,5,6};
        int size =arr.length;
         findDuplcate(arr,size);
*/
        int arr[] = {1,2,5,6,4,3,2,2,5,6,2};
   //     int arr[]={2,3,1,2,4,5,4,6,7,8,6};

        for (int i = 0; i < arr.length; i++) {
            arr[arr[i] % arr.length] = arr[arr[i] % arr.length] + arr.length;
        }
        System.out.println("The repeating elements are : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr.length*2) {
                System.out.println(i + " ");
            }
        }
    }
}