package ProgrammingTutorials.SortedArray;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5,6,7,8,9};
       /* int arr[]={1,9,3,43,4,7,55};
        Arrays.sort(arr);
*/
        int low =0;
        int high=arr.length-1;
        int search=7;
        while(low<=high){
            int mid =(low+high)/2;
            if(search==arr[mid]) {
                System.out.println("the value is found at index "+mid);
                break;
            }
            else if(arr[mid]>search){
                high=mid-1;
            }
            else if(arr[mid]<search){
                low=mid +1;
            }
        }
        if(low>high){
            System.out.println("Value is not found in array");
        }
    }
}
