package Arrays.Unsorted.rotation;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
* i/p={1,2,3,4,5} = {2,3,4,5,1} = {3,4,5,1,2}= {4,5,1,2,3}={5,1,2,3,4}
* o/p={5,1,2,3,4}
* */
public class LeftRoatation {
    static int[] rotLeft(int[] a, int d) {
        int n = a.length;
        int[] temp = new int[n];


        for (int i = 0; i < n; i++) {
           int  j = (i +n-d) % n;
            temp[j] = a[i];
        }

        return temp;

    }

    public static void main(String[] args) {

int arr[]={1,2,3,4,5};
int r=4;
     int res[]=rotLeft(arr,r);
        System.out.println(Arrays.toString(res));
    }

}
