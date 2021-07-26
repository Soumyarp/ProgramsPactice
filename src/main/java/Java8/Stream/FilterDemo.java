package Java8.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Soumya on Oct,2020
 */
public class FilterDemo {
    public static void main(String[] args) {
       /* ArrayList<Integer> nolist= new ArrayList();
        nolist.add(10);
        nolist.add(20);
        nolist.add(30);
        nolist.add(40);
        nolist.add(50);*/
       //2nd way to add data in the arraylist
       List<Integer> nolist= Arrays.asList(10,15,20,25,30);
       List<Integer> evennolist= new ArrayList();
       //w/o using streams
        for(int n:nolist){
            if(n%2==0){
                evennolist.add(n);
            }
        }
        System.out.println("without using stream"+evennolist);

        //with Streams



    }
}
