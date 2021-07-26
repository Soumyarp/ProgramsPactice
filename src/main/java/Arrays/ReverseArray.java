package Arrays;

import java.util.Scanner;

public class ReverseArray {

    // Using direct for loop

/*    public static void main(String[] args) {
       int arr[]={6,4,2,7,9,1};
       for(int i=arr.length-1;i>=0;i--){
           System.out.println(arr[i] +" ");
       }
    }*/


//    Using Brute force method  , swap logic
/*public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int n=sc.nextInt();
    int arr[]= new int[n];
    System.out.println("Enter the values of an array");

    for( int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int temp=0;
    int start=0;
    int end=n-1;
    while(start<end){
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end --;

    }
    for(int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
}*/

// USing Recursion

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the values of an array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        reverse(arr,0,n-1);
        System.out.println("After Reversing the array");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    private static void reverse(int arr[],int start,int end){
        //Terminating Condition
        if(start>=end)
            return;
        //Swapping Conditn
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        //Recursion logic
        reverse(arr,start+1,end-1);
    }
}
