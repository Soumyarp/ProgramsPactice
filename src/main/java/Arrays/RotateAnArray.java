package Arrays;

import java.util.Scanner;

public class RotateAnArray {
 public static int[] rotate(int[]arr, int k){
   //  System.out.println(arr.length);
     int res[]=new int[arr.length];
     k=k%res.length;
    reverse(0,res.length-k-1,arr);
     reverse(res.length-k,res.length-1,arr);
     reverse(0,res.length-1,arr);

     return res;
 }
  static void reverse(int start,int end, int ar[]){
     while(start<end){
         int temp=ar[start];
         ar[start]=ar[end];
         ar[end]=temp;
         start++;
         end --;
     }
  }

    public static void main(String[] args) {
        int m[]={1,2,3,4,5};int n=2;
        rotate(m,n);

        for(int i=0;i<m.length;i++){
            System.out.println(m[i]);

        }

    }
}
