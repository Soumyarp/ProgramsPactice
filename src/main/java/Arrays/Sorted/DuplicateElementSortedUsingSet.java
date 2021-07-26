package Arrays.Sorted;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementSortedUsingSet {
    public static void main(String[] args) {
    //    int arr[] = {1, 2, 2, 3, 4, 4, 5, 6, 6, 6, 7};
        int arr[]={5,4,4,5,6,1,1,6,7,2,3,2,9,8,9};
        Set<Integer> uniqueelement = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            uniqueelement.add(arr[i]);
        }
        System.out.println(uniqueelement);
    }
}
