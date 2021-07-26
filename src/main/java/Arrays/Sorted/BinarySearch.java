package Arrays.Sorted;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the values");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value to be searched");
        int num=sc.nextInt();
        int low=0;
        int high =n-1;
        int mid =0;
        while(low<=high){
            mid =(low+high)/2;
            if(num==arr[mid]){
                System.out.println("the searched element is found on index "+mid);
                break;
            }
            else if(arr[mid]<num){
                low=mid+1;
            }
            else if(arr[mid]>num){
                high=mid-1;
            }
        }
        if(low>high){
            System.out.println("Value is not found in the array");
        }
    }
}
