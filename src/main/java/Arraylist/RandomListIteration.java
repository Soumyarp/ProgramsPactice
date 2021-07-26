package Arraylist;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by Soumya
 */

// One list is there
    // random =2 //ok
    // no duplicate item
    // if duplicate item i need to skip (remove) and print non duplicate item

public class RandomListIteration {
    public static void main (String[] args) {
 List<String> list= Arrays.asList("apple", "banana", "orange", "guava");
 int random=2;
 Random r= new Random();
 for(int i=0;i<random;i++){
   int randomitems=r.nextInt(list.size());
  //   System.out.println(randomitems);
   String r1=list.get(randomitems);
 //    System.out.println(r1);
 //  list.remove(randomitems);

 }

 	}
}
