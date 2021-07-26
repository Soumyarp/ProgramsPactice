package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Soumya
 */
public class RemoveDuplicate {
    public static void main(String[] args) {
  //      ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(1,2,4,3,2,6,3,6,5,7,6,5));
        ArrayList<String> arr= new ArrayList<>(Arrays.asList("Soumya", "Ram", "Ramesh", "Suresh", "Soumya", "Ram"));
       /* ArrayList<Integer> newlist= new ArrayList<>();
        for(Integer list:arr){
            if(!newlist.contains(list)){
                newlist.add(list);
            }
        }
        System.out.println(newlist);*/

       //Using stream api
     //  List<Integer> new_list_no= arr.stream().distinct().collect(Collectors.toList());
        List<String> new_list_string= arr.stream().distinct().collect(Collectors.toList());

        System.out.println(new_list_string);

    }

}
