package Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Soumya
 */
public class FrequencySorting {
    public static void main(String[] args) {
        int arr[]= {2,3,3,5,6,2,1,1,4,1,4};
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
           if(map.containsKey(arr[i])){
               map.put(arr[i],map.get(arr[i])+1);
           }else{
               map.put(arr[i],1);
           }
        }
        System.out.println(map);

        }




}
