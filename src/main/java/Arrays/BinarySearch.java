package Arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int arr[] = {10,43,32,66,78,81,53,44,11,15,90};
        Arrays.sort(arr);
        int searchElement = 90;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if(searchElement==arr[mid]){
                System.out.println("Value is found at index no ::"+mid);
                break;
            }
            else if(searchElement>arr[mid]){
                low=mid+1;
            }
            else if(searchElement<arr[mid]){
                high=mid-1;
            }
            else
                System.out.println("Search Element is not present in the array");

        }
    }
}
