package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateElementUnsortedUsingMap {

    public static void main(String[] args) {
        int arr[]={2,1,4,3,5,2,3,5,6,5,7};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
                map.put(arr[i],1);
        }
       Set<Map.Entry<Integer,Integer>> entry= map.entrySet();
        for(Map.Entry<Integer,Integer> entry1:entry){
            if(entry1.getValue()>1){
                System.out.println(entry1.getKey());
            }
        }


    }
}
