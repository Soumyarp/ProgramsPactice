package Arrays.Sorted;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElementusingUnsortedUsingMap {
    public static void main(String[] args) {
        int arr[]={5,4,4,5,6,1,1,6,7,2,3,2,9,8,9};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
                map.put(arr[i],1);
        }
       map.forEach((k,v) -> System.out.print(k+" "));
    }
}
