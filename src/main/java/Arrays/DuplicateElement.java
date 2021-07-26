package Arrays;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
1. Removing Duplicate element from an unsorted array using -->>>> Set DataStructure
 */

public class DuplicateElement {
    public static void main(String[] args) {
        //  int arr[]={7,6,5,5,4,4,3,2,2,1};
        int arr[] = {2, 1, 4, 3, 5, 2, 3, 5, 6, 5, 7};

        Set set = new HashSet();
        for(Integer val:arr) {
            if (set.add(val) == false) {
                System.out.println(val);
            }
        }
       /* boolean isDuplicateExist=false;
        Set<Integer> set= new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                isDuplicateExist=true;
                System.out.println("Duplicate element is "+arr[i]);
            }
            else
                set.add(arr[i]);
        }
        if(!isDuplicateExist)
            System.out.println(-1);

    }*/
        /*-----------------------------------------------------------------------------------------------------------------------*/

    /*
   2.   First,sort the array and remove duplicate element from the array -->>> Brute force method
 */
    /*public static void main(String[] args) {
        int unsortedarr[]= {7,6,5,5,4,4,3,2,2,1};
        Arrays.sort(unsortedarr);
        System.out.println(Arrays.toString(unsortedarr));
    }*/


    }
}
